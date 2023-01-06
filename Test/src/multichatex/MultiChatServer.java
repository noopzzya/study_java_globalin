package multichatex;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiChatServer {

	ServerSocket ss = null;
	Socket s = null;
	ArrayList<ChatThread> chatlist = new ArrayList<>();
	
	public MultiChatServer() {
		
		try {
			ss = new ServerSocket(5000);
			System.out.println("서버가 시작되었습니다.");
			
			while(true) {
				
				s = ss.accept();
				InetAddress ip = s.getInetAddress();
				
				String ipAddress = ip.getHostAddress();
				System.out.println(ipAddress+ "님이 입장하셨습니다.");
				
				// thread 객체 추가
				ChatThread t=new ChatThread(s);
				
				t.start();
				
				chatlist.add(t);
				
			}
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}

	public static void main(String[] args) {

		new MultiChatServer();
	}


	// 연결 된 모든 클라이언트에게 메시지 중계
	void msgSendAll(String msg) {
		for (ChatThread ct : chatlist) {
			ct.outMsg.println(msg);
		}
	}

	// ChatThread 내부 클래스 선언
	class ChatThread extends Thread {

		// 수신 메시지와 파싱 메시지를 처리하는 변수 선언
		String msg;
		String[] rmsg;

		// 입출력 스트림 생성
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;
		private Socket s=null;
		
		public ChatThread(Socket s) {
			this.s=s;
		}

		// ChatThread클래스 메인
		@Override
		public synchronized void run() {
			try {

				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(), true);

				boolean status = true;

				while (status) {
					// 수신 된 메시지를 msg 변수에 저장
					msg = inMsg.readLine();

					// '/' 구분자를 기준으로 메시지를 문자열 배열로 파싱
					rmsg = msg.split("/");

					// 파싱된 문자열 배열의 두번재 요소값에 따라 처리
					// 로그아웃 메시지 일 때
					if (rmsg[1].equals("logout")) {
						chatlist.remove(this);
						msgSendAll("server/" + rmsg[0] + "님이 종료했습니다.");
						status = false;
					}else if(rmsg[1].equals("login")) {
						msgSendAll("server/"+rmsg[0]+"님이 로그인했습니다.");
					}
				}

			} catch (IOException io) {
				io.printStackTrace();
			}
		}// end run()

	}

}
