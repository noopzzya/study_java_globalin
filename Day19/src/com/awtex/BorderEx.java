package com.awtex;

import java.awt.*;
public class BorderEx extends Frame{

	Label a, b, c, d, e;
	
	public BorderEx() {
		
		super("BorderLayout");
		
		setLayout(new BorderLayout(20,20)); // 갭과 갭 사이
		
		a = new Label("↑", Label.CENTER);
		b = new Label("↓", Label.CENTER);
		c = new Label("←", Label.CENTER);
		d = new Label("→", Label.CENTER);
		e = new Label("이동", Label.CENTER);
		
		setBackground(Color.gray);
		
		a.setBackground(Color.red);
		b.setBackground(Color.green);
		c.setBackground(Color.blue);
		d.setBackground(Color.magenta);
		e.setBackground(Color.yellow);
		
		a.setForeground(Color.white); // 전경색
		b.setForeground(Color.white);
		c.setForeground(Color.white);
		d.setForeground(Color.white);
		e.setForeground(Color.white);
		
		add("North", a);
		add("South", b);
		add(c, BorderLayout.WEST);
		add(d, BorderLayout.EAST);		
		add("Center", e);
		
		WinEvent w = new WinEvent();
//		setBounds(300, 300, 300, 200); // (setLocation,setSize)
		setLocation(300, 300); // 창 위치
		setSize(300, 200); // 화면 크기 지정
//		pack(); // 최소크기
		setVisible(true); // 화면출력여부
		addWindowListener(w);
		
	}
	
	public static void main(String[] args) {
		
		new BorderEx();
		
	}

}
