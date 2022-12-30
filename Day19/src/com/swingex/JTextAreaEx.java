package com.swingex;

import java.awt.*;
import javax.swing.*;
public class JTextAreaEx extends JFrame{

	private JTextArea ta = new JTextArea(5, 10);
	private JScrollPane js = new JScrollPane(ta);
	
	public JTextAreaEx() {

		super("JTextArea Test");
		
		JPanel jp = (JPanel)this.getContentPane(); // Panel = (Panel)Frame 형변환
		
		jp.setLayout(new BorderLayout());
		jp.add("Center", js);
		
		setSize(new Dimension(300, 200));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new JTextAreaEx();

	}

}
