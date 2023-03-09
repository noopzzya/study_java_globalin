package com.gameex;

public class ColorTV extends TV{
	
	private int Color;
	
	public ColorTV(int size, int Color) {
		super(size);
		this.Color = Color;
	}
	
	public void prt() {
		System.out.println(getSize()+ "인치 " +Color+ "컬러");
	}
	
	public static void main(String[] args) {
		ColorTV ct = new ColorTV(32, 1024);
		ct.prt();

	}

}
