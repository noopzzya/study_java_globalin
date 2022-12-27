package com.awtex;

import java.awt.*;
public class FrameEx02 extends Frame {

	public FrameEx02() {
		super("test2");
		WinEvent w = new WinEvent();
		setSize(300, 200); // 화면 크기 지정
		setVisible(true); // 화면출력여부
		addWindowListener(w);
	}
	
	public static void main(String[] args) {
		
		new FrameEx02();

	}

}
