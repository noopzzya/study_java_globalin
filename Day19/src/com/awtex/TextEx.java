package com.awtex;

import java.awt.*;

public class TextEx extends Frame{

	private TextField tf = new TextField("제목:");
	private TextArea ta = new TextArea("메모", 5, 10);
	private Button bt = new Button("확인");
	private Label la = new Label("내용");
	
	public TextEx() {
		
		super("Text Test");
		
		setLayout(new BorderLayout());
		add("North", tf);
		add("South", bt);
		add("Center", ta);
		add("West", la);		
		
		WinEvent w = new WinEvent();
		setSize(300, 200); // 화면 크기 지정
		setVisible(true); // 화면출력여부
		addWindowListener(w);
		
	}
	
	public static void main(String[] args) {
		new TextEx();

	}

}
