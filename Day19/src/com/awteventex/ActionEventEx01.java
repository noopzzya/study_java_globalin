package com.awteventex;

import java.awt.*; // Frame
import java.awt.event.*; // event

public class ActionEventEx01 extends Frame implements ActionListener{

	private TextField tf = new TextField(10);
	
	public ActionEventEx01() {

		super("ActionEvent Test");
		
		setLayout(new FlowLayout());
		add(tf);
		
		WinEvent w = new WinEvent(); // 같은 패키지에 WinEvent 클래스 생성
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
		tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
		new ActionEventEx01();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			String str = tf.getText();
			System.out.println("메시지 : " +str);
			tf.setText(""); // 엔터치면 메세지 초기화
		}
	}

}
