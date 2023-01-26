package com.swingex;

import javax.swing.*;
public class FrameEx extends JFrame {

	public FrameEx() {
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료버튼
	}
	
	public static void main(String[] args) {
		
		new FrameEx();
		
	}

}
