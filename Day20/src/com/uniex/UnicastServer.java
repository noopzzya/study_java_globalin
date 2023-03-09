package com.uniex;
// 클라이언트의 연결 요청을 받아서 소켓을 생성하고 유지하는 서버

import java.io.*;
import java.net.*;

public class UnicastServer {

	public UnicastServer() {
		ServerSocket server = null;
		try {
			server = new ServerSocket(4000);
		} catch (IOException e) {
			System.out.println("해당 포트가 사용 중에 있습니다.");
			System.exit(0);
		}
		
		try {
			while(true) {
				System.out.println("서버가 시작되었습니다.");
				Socket socket = server.accept();
				
				// 사용자와 메시지를 송수신 할 스레드를 생성해서 스레드 소켓을 전달
				UnicastServerThread thread = new UnicastServerThread(socket);
				thread.start();	
			}
		} catch (IOException ii) {
			ii.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		new UnicastServer();

	}

}
