package multichatex;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultiChatClient implements ActionListener, Runnable {

	private String ip; // 서버 ip
	private String id; // 로그인,로그아웃	
	private Socket socket;
	
	// 입출력 스트림
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
	
	// 로그인 패널 구성
	private JPanel loginPanel; // 로그인 패널
	private JButton loginButton; // 로그인 버튼
	private JLabel label1; // 대화명 라벨
	private JTextField idInput; // 대화명 입력 텍스트 필드
	
	// 로그아웃 패널 구성
	private JPanel logoutPanel; // 로그아웃 패널
	private JLabel label2; // 대화명 출력 라벨
	private JButton logoutButton; // 로그아웃 버튼
	
	// 메시지 입력 패널 구성
	private JPanel msgPanel; // 입력 패널
	private JTextField msgInput; // 메시지 입력 텍스트 필드
	
	// 종료버튼
	private JButton exitButton;
	
	// 메인 프레임
	private JFrame jframe;
	
	// 채팅 내용 출력창
	private JTextArea msgOut;
	
	// 카드 레이아웃
	private Container tab;
	private CardLayout clayout;
	private Thread thread;
	
	boolean status;
	
	public MultiChatClient(String ip) { // ip 초기화
		
		this.ip = ip;

		// 로그인
		loginPanel = new JPanel();
		
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("로그인");		
		label1 = new JLabel("대화명");
		
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
		loginButton.addActionListener(this);
		
		// 로그아웃
		logoutPanel = new JPanel();
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutButton = new JButton("로그아웃");
		logoutButton.addActionListener(this);
		
		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);
		
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
		msgInput.addActionListener(this);
		
		exitButton =new JButton("종료");
		exitButton.addActionListener(this);
		
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);
		
		// 로그인, 로그아웃 패널을 선택하기 위한 카드레이아웃 패널 구성
		clayout = new CardLayout();
		tab = new JPanel();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");
		
		// 메인 프레임 구성
		jframe = new JFrame("::멀티챗::");
		msgOut = new JTextArea("", 10, 30); // 채팅내용
		msgOut.setEditable(false); // 채팅내용수정불가설정, 출력전용
		
		// VERTICAL_SCROLLBAR_ALWAYS : 항상,  HORIZONTAL_SCROLLBAR_NEVER: 필요 할 때
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);
		
		// 로그인 패널을 먼저 표시
		clayout.show(tab, "login");
		jframe.pack(); // 프레임 크기 먼저 설정
		jframe.setResizable(false); // 프레임 크기 조정 불가
		jframe.setVisible(true); // 프레임 표시
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE); // 종료
		
		
	}
	
	public void connectServer() {
		
		try {
			// 소켓 생성
			socket = new Socket(ip, 6000);
			System.out.println("[Client]Server 연결 성공!");
			
			// 입출력
			inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMsg = new PrintWriter(socket.getOutputStream(), true);
			
			// 서버에 메시지 전달
			outMsg.println(id+ "/" + "login");
			
			thread = new Thread(this);
			thread.start(); // run()으로
			
		} catch (Exception e) {
			System.out.println("[MultiChatClient]connectServer() Exception 발생했다.");
		}
		
	}
	
	
	@Override
	public void run() {
		// 수신 된 메시지 처리하는 변수
		String msg;
		String[] rmsg;
		
		status = true;
		
		while(status) {
			
			try {
				
				// 메시지 수신과 파싱
				msg = inMsg.readLine();
				rmsg = msg.split("/");
				
				// JTextArea에 수신된 메시지를 추가
				msgOut.append(rmsg[0]+ ">" +rmsg[1]+ "\n");
				
				// 커서를 현재 대화 메시지에 표시함
				msgOut.setCaretPosition(msgOut.getDocument().getLength());
				
			} catch (IOException ii) {
				status = false;
			}			
		} // end while
		
		System.out.println("[MultiChatClient]" +thread.getName()+ "종료되었습니다.");
		
	} // end run

	// 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == exitButton) {
			System.exit(0);; // 죵료
			
		}else if(obj == loginButton) { // 로그인
			id = idInput.getText();
			label2.setText("대화명:" +id);
			clayout.show(tab, "logout");
			connectServer();
			
		}else if(obj == logoutButton) { // 로그아웃
			outMsg.println(id+"/" +"logout");
			msgOut.setText(""); // 초기화
			clayout.show(tab, "login");
			outMsg.close();
			try {
				inMsg.close();
				socket.close();
			} catch (IOException ee) {
				ee.printStackTrace();
			}
			status = false;
			
		}else if(obj == msgInput) {
			// 메시지 전송
			outMsg.println(id+"/" +msgInput.getText());
			// 메시지 입력창 초기화
			msgInput.setText("");
		}
		
	}

	public static void main(String[] args) {
		new MultiChatClient("127.0.0.1");

	}

}
