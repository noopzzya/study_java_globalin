package com.project;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{

	private JTabbedPane tp;
	private AddPane ap;
	private FindPane fp;
	private TotalPane ttp;
	
public MainFrame() {
	
	tp = new JTabbedPane();
	ap = new AddPane();
	fp = new FindPane();
	ttp = new TotalPane();
	
	tp.addTab("사원정보입력", ap);
	tp.addTab("사원정보조회", fp);
	tp.addTab("전체사원보기", ttp);
	
	getContentPane().add(tp);
	setTitle("사원관리 프로그램");
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}	
	
	public static void main(String[] args) {
		new MainFrame().setSize(600, 600);
	}

}
