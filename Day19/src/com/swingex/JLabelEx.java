package com.swingex;

import java.awt.*;
import javax.swing.*;

public class JLabelEx extends JFrame{

	private Icon icon = new ImageIcon("src/img/ico01.jpg"); // 절대경로
	private JLabel jib1 = new JLabel(icon);
	private JLabel jib2 = new JLabel("Test2", JLabel.CENTER);
	private JLabel jib3 = new JLabel("Test3", icon, SwingConstants.RIGHT);

	
	public JLabelEx() {
		
		super("JLabel Test");
		
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3,1));
		con.add(jib1);
		con.add(jib2);
		jib2.setIcon(icon);
		con.add(jib3);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JLabelEx();

	}

}
