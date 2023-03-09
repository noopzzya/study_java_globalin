package com.absex;

public class InterFaceEx implements InterEx {

	@Override
	public int getA() {		
		return A;
	}

	public static void main(String[] args) {
		InterFaceEx ie = new InterFaceEx();
		System.out.println(ie.getA());
	}	
}
