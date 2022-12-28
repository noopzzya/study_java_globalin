package com.awteventex;

import java.awt.*;
import java.awt.event.*;

public class ActionEventEx03 extends Frame implements ActionListener{

	private Button[] bt = new Button[4];
	private Panel[] pp = new Panel[4];
	private Color[] cc = {Color.red, Color.green, Color.blue, Color.yellow};
	
	private CardLayout card = new CardLayout();
	private Panel pptop;
	
	public ActionEventEx03() {
		
		super("ActionEvent Test3");
		setLayout(new BorderLayout());
		Panel p = new Panel(new GridLayout(1,4));
		
		for(int i=0; i<bt.length; i++) {
			bt[i] = new Button(i+1+ "번 버튼");
			bt[i].addActionListener(this); // 버튼 클릭 시 색 변화
			p.add(bt[i]);
		}
		
		add("North", p);
		
		pptop = new Panel(card);
		for(int i=0; i<pp.length; i++) {
			pp[i] = new Panel();
			pp[i].setBackground(cc[i]);
			pptop.add(""+i, pp[i]);
		}
		
		add("Center", pptop);
		card.show(pptop, "0");
		
		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
	}
	
	public static void main(String[] args) {	
		new ActionEventEx03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0; i<4; i++) {
			if(e.getSource() == bt[i]) {
				card.show(pptop, ""+i);
			}
		}
		
	}

}
