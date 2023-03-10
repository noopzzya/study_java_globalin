package study;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class CalculatorEx extends JFrame implements ActionListener{

	private JTextField tf = new JTextField(); // 계산식 텍스트필드

	private JPanel jp = new JPanel(); // 버튼용 패널
	
	private String num = ""; // 계산식 숫자 담는 변수
	private String prevOperation = ""; // 방금 클릭한 버튼 기억 변수
	private ArrayList<String> equation = new ArrayList<String>(); // 숫자 연산 구분하여 담을 배열
	
	// 계산기 버튼 배열
	private String[] str =
		{" ", " ", "←", "CE", "C",
		"7", "8", "9", "/", "sqrt",
		"4", "5", "6", "*", "%",
		"3", "2", "1", "-", "1/x",
		"0", "+/-", ".", "+", "="};
	
	private JButton[] bt = new JButton[str.length];
	
	public CalculatorEx() {
		
		super("계산기");
//		setLayout(null); 배치관리자 null 일 경우
//		tf.setBounds(8, 10, 270, 70); 컴포넌트의 위치, 크기 꼭 설정해야함
		
		add("North", tf);
		tf.setHorizontalAlignment(JTextField.RIGHT); // 오른쪽 정렬

		add("Center", jp);
		jp.setLayout(new GridLayout(5, 5, 3, 5));	
		for(int i=0; i<bt.length; i++) {
			jp.add(bt[i] = new JButton(str[i]));
			bt[i].setFont(new Font("궁서체", Font.BOLD, 15));
			
			int[] num = new int[bt.length];
			try {// parseInt() 메소드가 NumberFormatException 발생하여 예외처리 try catch 사용
				num[i] = Integer.parseInt(str[i]); // 형변환으로 버튼 색 지정
				bt[i].setForeground(java.awt.Color.blue);
			} catch (NumberFormatException e) {
				bt[i].setForeground(java.awt.Color.red);
			}
			bt[i].addActionListener(this);
		}
				
		setSize(new Dimension(400, 320));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	
	public static void main(String[] args) {
		new CalculatorEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 버튼인식
		String operation = e.getActionCommand(); // getActionCommand : 이벤트 발생한 객체의 문자열 가져옴
		
		if(operation.equals("C")) {
			tf.setText(""); // 초기화
		} else if(operation.equals("CE")) { // 수정예정
			tf.setText("");
		} else if(operation.equals("←")) { // 백스페이스
				String back = tf.getText();
				if(back.length() !=0) {
					tf.setText(back.substring(0, back.length()-1)); // substring : 문자열 자르기
				}
		} else if(operation.equals("=")) { // 계산 한 값이 나오도록
			String result = Double.toString(calculate(tf.getText()));
			tf.setText(""+result);
			num = "";
		} else if(operation.equals("sqrt")) { // 루트
			double root = Math.sqrt(Double.parseDouble(tf.getText()));
			tf.setText(""+root);
		} else if(operation.equals("%")) { // 수정예정
			tf.setText("");
		} else if(operation.equals("1/x")) { // 역수
			double num = 1 / Double.parseDouble(tf.getText());
			tf.setText(""+num);
		} else if(operation.equals("+/-")) { // 수정예정
			tf.setText("");
		} else if(operation.equals(".")) { // 소수점
			tf.setText(tf.getText()+".");
		} else if(operation.equals("+") || operation.equals("-") || 
					operation.equals("*") || operation.equals("/") ||
					operation.equals("%")) { // 클릭한 버튼이 연산자일 때
			if(tf.getText().equals("") && operation.equals("-")) { // 첫 값 음수 입력가능
				tf.setText(tf.getText() + e.getActionCommand());
			} else if(!tf.getText().equals("") && !prevOperation.equals("+") && 
					!prevOperation.equals("-") && !prevOperation.equals("*") && 
					!prevOperation.equals("/") && !prevOperation.equals("%")) {
				tf.setText(tf.getText() + e.getActionCommand());
			}
		}else { // 나머지 버튼 클릭 시 계산 시 추가
			tf.setText(tf.getText() + e.getActionCommand());
		}
		prevOperation = e.getActionCommand(); // 마지막 버튼 기억
	}

	// 텍스트 파싱 메소드
	private void fullTextparsing (String inputText) {
		equation.clear(); // clear() : ArrayList 객체 삭제하는 초기화 메소드 
		
		for(int i=0; i<inputText.length(); i++) {
			char ch = inputText.charAt(i);
			
			// 연산기호 ArrayList 추가 후 초기화
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				equation.add(num); // 숫자 ArrayList 추가
				num = ""; // num 초기화
				equation.add(ch + ""); // 연산기호 ArrayList 추가
			}  else {
				num = num+ch; // 나머지 숫자
			}
			
		} // for문 끝
		equation.add(num); // 남아있는 num 추가
		equation.remove(""); // - 일 경우 "" 에러 발생 제거
	}
	
	// 계산 기능 메소드
	public double calculate (String inputText) {
		fullTextparsing(inputText);
		// 텍스트 파싱 메소드 실행 시 ArrayList에 숫자, 연산기호 담겨짐
		
		double prev = 0; // 결과값
		double current = 0;
		String mode = ""; // 연산자 변수
		
		for(String s : equation) { // 변수 : 배열레퍼런스
			if(s.equals("+")) {
				mode = "add";
			} else if(s.equals("-")) {
				mode = "sub";
			} else if(s.equals("*")) {
				mode = "mul";
			} else if(s.equals("/")) {
				mode = "div";
			} else {
				current = Double.parseDouble(s); // 숫자인 경우 double 형변환
					if(mode.equals("add")) {
						prev += current;
					} else if(mode.equals("sub")) {
						prev -= current;
					} else if(mode.equals("mul")) {
						prev *= current;
					} else if(mode.equals("div")) {
						prev /= current;
					}  else {
						prev = current;
					}
			}
		} // for문 끝
		
		return prev;
	}
	
}