package com.multi;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiChatServer {

	// 서버소켓과 클라이언트 연결 소켓 (전역선언)
	private ServerSocket ss = null;
	private Socket s = null;
	
	// 연결된 클라이언트 스레드를 관리하는 ArrayList
	private ArrayList<ChatThread> chatlist = new ArrayList<ChatThread>();
	
	// 채팅 프로그램을 실행하는 메인 프로그램
	public void start() {
		
		// 소켓 생성 시 예외처리 해야함
		try {
			// 서버소켓 생성
			ss = new ServerSocket(6000); // 클라이언트는 (서버ip,포트번호) 필요
			System.out.println("서버가 시작되었습니다.");
			
			// 무한루프 돌면서 클라이언트 연결 대기
 			while(true) {
 				s = ss.accept();
 				
 				// 연결된 클라이언트에게 스레드를 생성
 				ChatThread chat = new ChatThread();
 				
 				// 클라이언트 리스트 추가
 				chatlist.add(chat);
 				
 				// 스레드 시작
 				chat.start();			
 			}
			
		} catch (Exception e) {
			System.out.println("[MultiChatServer]start() Exception 발생");
		}	
	}
	
	// 연결된 모든 클라이언트에게 메시지를 전송하는 메소드
	public void msgSendAll(String msg) {
		
		for(ChatThread ct : chatlist) {
			ct.outMsg.println(msg); // 스트림 통해 출력
		}
	}
	
	// 클라이언트를 관리하기위한 스레드 클래스 (내부클래스)
	class ChatThread extends Thread{
		
		// 수신 메시지와 파싱 메시지를 처리할 변수를 선언
		String msg;
		String[] rmsg;
		
		// 입출력 스트림 생성
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;
		
		@Override
		public void run() {
			
			// while문 돌리는 변수
			boolean status = true;
			System.out.println("##ChatThread start");
			
			try {				
				// 입출력 스트림
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(), true);
				
				// true 일 경우 루프 돌며 사용자한테 수신 메시지 처리
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
						// 해당 클라이언트 스레드 종료로 status를 false로 설정
						status = false;
					}else if(rmsg[1].equals("login")) { // 로그인 메시지일 때
						msgSendAll("server/" + rmsg[0] + "님이 로그인했습니다.");
					}else {// 그 밖의 일반 메시지일 때
					msgSendAll(msg);
					}
				}
				// while문 종료 (루프를 벗어나면 클라이언트 연결이 종료, 스레드에 인터럽트가 발생
				this.interrupt();
				System.out.println("##"+this.getName()+ "stop!");
				
			} catch (IOException e) {
				chatlist.remove(this);
				System.out.println("[ChatThread]run() IOException 발생");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		MultiChatServer ms = new MultiChatServer();
		ms.start();		
//		new MultiChatServer().start(); 둘 다 start 실행 편한거로 사용가능

	}

}
