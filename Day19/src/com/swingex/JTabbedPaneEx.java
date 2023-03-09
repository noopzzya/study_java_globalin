package com.swingex;

import java.awt.*;
import javax.swing.*;
public class JTabbedPaneEx extends JFrame{

	private ImageIcon icon1 = new ImageIcon("src/img/ico03.jpg");
	private ImageIcon icon2 = new ImageIcon("src/img/ico04.jpg");
	
	private JLabel jlb = new JLabel("라벨", icon1, JLabel.CENTER);
	private JButton jbt = new JButton("버튼", icon1);
	
	private JTabbedPane jtp = new JTabbedPane(SwingConstants.TOP);
	
	public JTabbedPaneEx() {
		
		super("JTabbedPane Test");
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		
		jtp.addTab("라벨", icon2, jlb);
		jtp.addTab("버튼", icon2, jbt);
		
		con.add("Center", jtp);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new JTabbedPaneEx();

	}

}
