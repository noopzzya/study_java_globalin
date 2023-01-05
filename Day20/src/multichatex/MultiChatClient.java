package multichatex;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.net.*;

public class MultiChatClient implements ActionListener, Runnable{
	
	// 실행
	private String ip;
	private String id;
	private Socket socket = null;
	
	private BufferedReader inMsg;
	private PrintWriter outMsg;
	
	// 로그인 패널
	private JPanel loginPanel;
	
	// 로그인 버튼
	private JButton loginButton;
	
	// 대화명 라벨
	private JLabel label1;
	
	// 대화명 입력 텍스트 필드
	private JTextField idlnput;
	
	// 로그아웃 패널 구성
	private JPanel logoutPanel;
	
	// 대화명 출력 라벨
	private JLabel label2;
	
	// 로그아웃 버튼
	private JButton logoutButton;
	
	// 입력 패널 구성
	private JPanel msgPanel;
	
	// 메시지 입력 텍스트 필드
	private JTextField msglnput;
	
	// 종료 버튼
	private JButton exitButton;
	
	private JTextArea msgout;
	
	// 카드 레이아웃 관련
	private Container tab;
	private CardLayout clayout;

	private Thread thread;
	
	private boolean status;

	
	// 생성자 서버주소 설정, swing 이용하여 화면구성
	public MultiChatClient(String ip) {
		
		// 실행
		this.ip = ip;
		
		// 로그인 패널 구성
		loginPanel = new JPanel();
		
		// 레이아웃 설정
		loginPanel.setLayout(new BorderLayout());
		idlnput = new JTextField(15);
		loginButton = new JButton("로그인");
		
		// 이벤트 리스너 등록
		loginButton.addActionListener(this);
		label1 = new JLabel("대화명");
		
		// 패널에 위젯 구성
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idlnput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
		
		// 로그아웃 패널 구성
		logoutPanel = new JPanel();
		
		// 레이아웃 설정
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutButton = new JButton("로그아웃");
		
		// 이벤트 리스너 등록
		logoutButton.addActionListener(this);
		
		// 패널에 위젯 구성
		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);
		
		// 입력 패널 구성
		msgPanel = new JPanel();
		
		// 레이아웃 설정
		msgPanel.setLayout(new BorderLayout());
		msglnput = new JTextField(30);
		
		// 이벤트 리스너 등록
		msglnput.addActionListener(this);
		exitButton = new JButton("종료");
		exitButton.addActionListener(this);
		
		// 패널에 위젯 구성
		msgPanel.add(msglnput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);
		
		// 로그인/로그아웃 패널 선택을 위한 카드 레이아웃 패널
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");
		
		// 메인 프레임 구성
		JFrame jframe = new JFrame("::멀티챗::");
		JTextArea msgOut = new JTextArea(" ", 10, 30);
		
		// JTextArea 수정 안 되게 설정, 출력 전용으로 사용
		msgOut.setEditable(false); 
		
		// 수직 스크롤바는 항상 나타냄, 수평 스크롤바는 필요할 때만 나타남
		JScrollPane jsp = new JScrollPane(
				msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(tab, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);
		
		
	}
	
	
	// 서버 주소, 소켓 연결, 입출력 스트림 생성, 수신메시지 처리
	public void connectServer() {
		
	}
	
	// 로그인, 로그아웃, 메시지전송, 종료
	@Override
	public void actionPerformed(ActionEvent e) {
		// 메소드 구현. 각 위젯 발생하는 이벤트 처리코드 작성
		// 콘솔로 메시지 출력 구성
//		if (e.getSource() == )
		
	}
	
	// 스레드 실행 시 자동 호출 메소드(무한루프 입력스트림으로 수신된 메시지 파싱)
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		MultiChatClient mcc = new MultiChatClient("192.168.0.33");

	}



}
