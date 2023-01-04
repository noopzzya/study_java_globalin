package com.echoex;

import java.io.*;
import java.net.*;

public class EchoClient {

	public EchoClient() {
		try {
			
			// 1. 서버 소켓
			Socket s = new Socket("localhost", 5000);
			
			// 순서 바뀜
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			// 사용자에게 메시지를 전송
			bw.write("반갑숩니다. 아무개입니다.\n");
			bw.flush();		
						
			// 사용자가 전송한 메시지 읽기
			String message = br.readLine();
			System.out.println("서버가 보낸 메시지" +message);
					
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다.");
		} catch (IOException ii) {
//			ii.printStackTrace();
			System.out.println("해당 port는 누군가에게 사용 중입니다.");
		}
	}
	
	public static void main(String[] args) {
		new EchoClient();

	}

}
