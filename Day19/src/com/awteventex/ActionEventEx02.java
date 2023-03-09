package com.awteventex;

import java.awt.*; // Frame
import java.awt.event.*; // event

public class ActionEventEx02 extends Frame implements ActionListener{

	private Button bt = new Button("종료");
	
	public ActionEventEx02() {
		
		super("ActionEvent Test2");
		
		setLayout(new FlowLayout());
		
		add(bt);
		
		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
		bt.addActionListener(this);

	}
	
	public static void main(String[] args) {		
		new ActionEventEx02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt) {
			System.exit(0);
		}
		
	}

}
