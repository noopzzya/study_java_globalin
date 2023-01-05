package com.multiex;

import java.io.*;

public class MultiClientThread extends Thread{

	private BufferedReader in; // 전달
	
	public MultiClientThread(BufferedReader in) {
		this.in = in;
	}
	
	@Override
	public void run() {
		
		try {
			while(true) {
				String text = in.readLine();
				System.out.println("수신 메시지:" + text);
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
