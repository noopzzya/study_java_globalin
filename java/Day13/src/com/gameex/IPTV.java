package com.gameex;

/* 문1]
 * ColorTV를 상속받아 IPTV를 구현하시오
 * 
 * IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
 * iptv.prt();
 * 
 * IP주소 : 192.1.1.2 주소의 32인치 2048 컬러
 */

public class IPTV extends ColorTV{
	
	private String ipAddr;
	
	public IPTV(String ipAddr, int size, int Color) {
		super(size, Color);
		this.ipAddr = ipAddr;
	}
	
	@Override
	public void prt() {
		System.out.print("나의 IPTV는 " +ipAddr+ " 주소의 ");
		super.prt();
	}

	public static void main(String[] args) {
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.prt();
	}
}
