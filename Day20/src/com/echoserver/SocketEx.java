package com.echoserver;

import java.net.*;

public class SocketEx {

	public static void main(String[] args) {
		try {
		
//			Socket s = new Socket("localhost", 3000);
			Socket s = new Socket("192.168.0.113", 3000); // 선생님 서버 접속
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
