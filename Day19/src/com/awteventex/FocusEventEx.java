package com.awteventex;

import java.awt.*;
import java.awt.event.*;
public class FocusEventEx extends Frame implements FocusListener {

	private TextField[] tf = new TextField[3];
	
	
	public FocusEventEx() {
		
		super("FocusEvent Test");
		setForm();
		
		WinEvent w = new WinEvent();
		setSize(200, 100);
		setVisible(true);
		addWindowListener(w);
	}
	
	public void setForm() {
		setLayout(new BorderLayout());
		
		Panel p = new Panel(new GridLayout(3, 1));
		p.add(new Label("이름"));
		p.add(new Label("전번"));
		p.add(new Label("주소"));
		
		add("West", p);
		
		Panel pp = new Panel(new GridLayout(3, 1));
		for(int i=0; i<tf.length; i++) {
			tf[i] = new TextField();
			pp.add(tf[i]);
			tf[i].addFocusListener(this);
		}
		add("Center", pp);
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		if(e.getSource() == tf[1]) {
			if(tf[0].getText().trim().length() == 0) {
				tf[0].setText("");
				try {
					Thread.sleep(3000); // 마우스 커서 깜빡거리다 정지
				}catch(InterruptedException ee) {
					
				}
				tf[0].requestFocus();
			}
			
		}else if(e.getSource() == tf[2]) {
			if(tf[1].getText().trim().length() == 0) {
				tf[1].setText("");
				try {
					Thread.sleep(3000);
				}catch(InterruptedException ee) {
					
				}
				tf[1].requestFocus();
			}
		}
		

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new FocusEventEx();

	}

}
