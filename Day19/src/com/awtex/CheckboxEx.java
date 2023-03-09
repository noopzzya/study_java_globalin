package com.awtex;

import java.awt.*;
public class CheckboxEx extends Frame{

	private Label lb = new Label("like fruit ?");
	private Checkbox[] cb = {new Checkbox("Banana", true), new Checkbox("StrawBerry"), new Checkbox("Pineapple")};
	private Button bt = new Button("Confirm");
	
	public CheckboxEx() {

		super("Checkbox Test");
		
		setLayout(new GridLayout(5, 1));
		
		add(lb);
		
		for(int i=0; i<cb.length; i++) {
			add(cb[i]);
		}
		
		add(bt);

		WinEvent w = new WinEvent();
		setSize(300, 200); // 화면 크기 지정
		setVisible(true); // 화면출력여부
		addWindowListener(w);
		
	}
	
	public static void main(String[] args) {
		new CheckboxEx();
	}

}
