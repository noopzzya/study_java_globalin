package com.multiex;

/* 각각의 클라이언트와 연결된 Socket 객체를 가지고 있으며,
 * 클라이언트와 접속을 유지하고, 통신을 담당하는 객체다
 * 
 * 특정 클라이언트가 전송한 메시지를 수신해서 
 * 모든 클라이언트에게 전송하는 broadcasting이 구현되는 클래스
 */

import java.io.*;
import java.net.*;
import java.util.*;


public class MultiServerThread extends Thread {

	private Socket socket;

	private BufferedReader in;
	
	private PrintWriter out;
	
	private ArrayList<MultiServerThread> clientList;
	
	
	public MultiServerThread(ArrayList<MultiServerThread> clientList, Socket socket) {
		
		this.clientList = clientList;
		this.socket = socket;
		
	}
	
	// 스레드를 이용해서 실행시키고자 하는 내용을 구현하는 메소드
	@Override
	public synchronized void run() { // synchronized : 동기화
		
		try {
			// 스트림 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			out = new PrintWriter(socket.getOutputStream());
			
			// 클라이언트와 메시지를 반복적으로 송수신
			while(true) {
				
				// 클라이언트가 보낸 메시지 읽기
				String msg = in.readLine();
				
				broadcasting(msg);
			}		
		} catch (IOException io) {
			
			// 통신끊긴 경우
			clientList.remove(this);
			
			String ipAddress = socket.getInetAddress().getHostAddress();
			
			try {
				// 다른 클라이언트에게 퇴장 사실을 알림
				broadcasting(ipAddress+ "와의 연결이 끊어졌습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
		
	}
	
	// 모든 클라이언트(사용자)에게 메시지를 전달하는 기능
	public void broadcasting(String msg) throws IOException{
		
		/* clientList에 저장된 MultiServerThread의 개수만큼 반복하면서
		 * 각각의 MultiServerThread의 sendMsg메소드를 호출해서
		 * 연결된 클라이언트에게 메시지를 전달
		 */
		
		for(MultiServerThread t : clientList) {
			// 각각의 MultiServerThread의 sendMsg메소드를 호출해서
			// 메시지를 각각의 클라이언트에게 전달
			t.sendMsg(msg);
		}
		
	}
	
	// 전달받은 메시지를 소켓에 OutputStream과 연결된	
	// PrintWriter를 이용해서 클라이언트에게 전달하는 기능
	public void sendMsg(String msg) throws IOException{
		
		out.println(msg);
		out.flush();
		
	}
	
}
