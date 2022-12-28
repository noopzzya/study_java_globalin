package com.awtex;

import java.awt.*;
public class CheckboxGroupEx extends Frame {

	private GridLayout gl = new GridLayout(4,1);
	private Label la = new Label("gender?");
	private CheckboxGroup cg = new CheckboxGroup();
	private Checkbox man = new Checkbox("M", cg, true);
	private Checkbox woman = new Checkbox("W", cg, false);
	private Button bt = new Button("Confirm");
	
	public CheckboxGroupEx() {		
		
		super("CheckboxGroupEx");
		
		setLayout(gl);
		
		add(la);
		add(man);
		add(woman);
		add(bt);
		
		WinEvent w = new WinEvent();
		pack(); // 화면 크기 지정
		setVisible(true); // 화면출력여부
		addWindowListener(w);
		
	}
	
	public static void main(String[] args) {
		new CheckboxGroupEx();
	}

}
