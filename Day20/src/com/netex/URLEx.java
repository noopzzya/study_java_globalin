package com.netex;

import java.io.*;
import java.net.*;

public class URLEx {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://www.naver.com/index.html");
			URLConnection uc = url.openConnection();
			uc.connect();
			// url : 프로토콜, 호스트명, 포트번호, 자원의 경로, 쿼리스트링 정보를 얻을 수 있다
			
			/*
			System.out.println("프로토콜:" +url.getProtocol());
			System.out.println("호스트명:" +url.getHost());
			System.out.println("포트번호:" +url.getPort());
			System.out.println("경로:" +url.getPath());
			System.out.println("파일:" +url.getFile());
			*/
			
//			br = new BufferedReader(new InputStreamReader(url.openStream()));
			br = new BufferedReader(new InputStreamReader(uc.getInputStream()));			
			String str = null;
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (MalformedURLException me) {
			me.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch(IOException ee) {}
		}
		
		
	}

}
