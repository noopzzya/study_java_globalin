package com.swingex;

import java.awt.*;
import javax.swing.*;

public class JTableEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("참가자 명단 프로그램");

		f.setPreferredSize(new Dimension(300, 150));
		f.setLocation(500, 400);
		Container con = f.getContentPane();
		
		String colName[] = {"이름", "나이", "성별"};
		Object data[][] = {
				{"김철수", 24, "남"},
				{"김영희", 23, "여"},
				{"홍길동", 29, "남"}
		};
		
		JTable table = new JTable(data, colName);
		
		JScrollPane scrollPane = new JScrollPane(table);
		con.add(scrollPane, BorderLayout.CENTER);
		JButton button = new JButton("출력");
		button.addActionListener(new PrintActionListener(table));
		con.add(button, BorderLayout.SOUTH);
				
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
