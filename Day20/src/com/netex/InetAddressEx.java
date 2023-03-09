package com.netex;

import java.net.*;

public class InetAddressEx {

	public static void main(String[] args) {
		
/* InetAddress : ip정보와 host정보를 가지는 객체
 * 					   InetAddress 객체는 생성자가 아닌 static 메소드를 이용해서 생성
 */
	
		try {
			
			InetAddress ipInfo1 = InetAddress.getByName("localhost"); // localhost = 127.0.0.1 (해당 컴퓨터 ip)
			
			String ip = ipInfo1.getHostAddress(); // ip주소 get
			System.out.println("ip주소" +ip);
			
			InetAddress[] ipArray = InetAddress.getAllByName("www.google.com");
			for(InetAddress ipp : ipArray) {
				System.out.println(ipp);
			}
			
			// 현재 컴퓨터의 ip 정보
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("host :" +myHost.getHostName());
			System.out.println("host ip:" +myHost.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
