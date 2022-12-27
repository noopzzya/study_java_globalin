package com.awtex;

import java.awt.*;
public class ListEx extends Frame{

	private Label la = new Label("과목 이름");
	private List li = new List(4, true);
	
	private Button bt = new Button("확인");
	private String[] name;
//	private String[] a = {"Java", "Jsp", "Database", "Spring"};

	public ListEx(String[] a) {
				
		super("List Test");
		
		this.name = a;
		
		setLayout(new BorderLayout());
		for(int i=0; i<name.length; i++) {
			li.add(name[i]);
		}
		
		add("North", la);
		add("Center", li);
		add("South", bt);
		
		
		li.setFont(new Font("궁서체", Font.BOLD, 30));
		
		WinEvent w = new WinEvent();
		setSize(300, 300); // 화면 크기 지정
		setVisible(true); // 화면출력여부
		addWindowListener(w);
		
	}
	
	public static void main(String[] args) {
		
//		String[] a = {"Java", "Jsp", "Database", "Spring"};
		new ListEx(args); // args 추가

	}

}
