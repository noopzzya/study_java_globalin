package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JProgressBarEx extends JFrame implements ActionListener, Runnable {

	private JProgressBar jpb = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
	private JButton jbt = new JButton("시작");
	private JButton jbt1 = new JButton("정지");
	
	public JProgressBarEx() {

		super("JProgressBar Test");
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", new JLabel("이것이 프로그레스"));
		con.add("Center", jpb);
		jpb.setStringPainted(true);
		jpb.setString("0%");
		
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jp.add(jbt); jp.add(jbt1);
		
		con.add("South", jp);
		
		jbt.addActionListener(this);
		jbt1.addActionListener(this);
		
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private boolean bb = true;
	private static int ii;
	
	@Override
	public void run() {
		
		if(ii == 100) ii = 0; // 초기화

		for(int i=ii; i<=100; i++) {
			if(!bb) break;
			try {
				Thread.sleep(50);
			}catch (InterruptedException ee) {}
			
			jpb.setValue(i);
			ii = i;
			jpb.setString(i+ "%");
		}
		jbt.setEnabled(true);
		jbt1.setEnabled(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jbt) {
			bb = true;
			new Thread(this).start(); // start() > run()
			jbt.setEnabled(false);
			jbt1.setEnabled(true);
			
		}else if(e.getSource() == jbt1) {
			bb = false;
			jbt.setEnabled(true);
			jbt1.setEnabled(false);
		}

	}

	public static void main(String[] args) {
		new JProgressBarEx();

	}

}
