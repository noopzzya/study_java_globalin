package study;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorEx extends JFrame implements ActionListener{

	private JTextField tf = new JTextField("0");

	private JPanel jp = new JPanel();
	
	private String[] str = 
		{" ", " ", "←", "CE", "C",
		"7", "8", "9", "/", "sqrt",
		"4", "5", "6", "*", "%",
		"3", "2", "1", "-", "1/x",
		"0", "+/-", ".", "+", "="};
	
	private JButton[] bt = new JButton[str.length];
	
	public CalculatorEx() {
		
		super("계산기");
		
//		tf.setText("0");
//		tf.setEditable(false);
		
		add("North", tf);
		tf.setHorizontalAlignment(JTextField.RIGHT);

		add("Center", jp);
		jp.setLayout(new GridLayout(5, 5, 3, 5));	
		for(int i=0; i<bt.length; i++) {
			jp.add(bt[i] = new JButton(str[i]));
			bt[i].setFont(new Font("궁서체", Font.BOLD, 15));
			
			int[] num = new int[bt.length];
			try {// parseInt() 메소드가 NumberFormatException 발생하여 예외처리 try catch 사용
				num[i] = Integer.parseInt(str[i]);
				bt[i].setForeground(java.awt.Color.blue); // 숫자 형변환 시 블루
			} catch (NumberFormatException e) {
				bt[i].setForeground(java.awt.Color.red); /// 그외 레드
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
		
//		String actionCommand = e.getActionCommand();
//		tf.setText(tf.getText() + actionCommand);

//		if(tf.getText() == "0") {
//			tf.setText(tf.getText() + actionCommand); // 초기화
//		}
				
//		tf.setText(tf.getText() + actionCommand);
		
		if(tf.getText().equals("0")) {
			tf.setText(""); // 초기화
		}else { // 버튼입력
			tf.setText(tf.getText()+ bt);
		}
			
	}

}