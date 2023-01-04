package com.uniex;

import java.io.*;
import java.net.*;

/*
각각의 클라이언트와 연결된 소켓 가지고 있으며
클라이언트와 접속을 유지하고 통신을 담당
*/
public class UnicastServerThread extends Thread{

	Socket socket = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	public UnicastServerThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		// 스트림 연결
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 사용자와 대화를 송수신(무한루프)
			while(true) {
				// 사용자가 전달한 메시지 수신
				String msg = br.readLine();
				System.out.println(msg);
				
				// 사용자에게 메시지를 재전송
				bw.write(msg+"\n");
				bw.flush();	// 비우기				
			}
			
		} catch (IOException e) {
			InetAddress ip = socket.getInetAddress();
			String addr = ip.getHostAddress();
			System.out.println("[" +addr+ "]와의 연결이 끊어졌습니다.");
		}
		
	}
	
}
