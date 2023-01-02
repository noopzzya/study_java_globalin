package com.swingex;

import java.awt.*;
import javax.swing.*;

public class GraphicEx02 {

	public static void main(String[] args) {

		JFrame f = new JFrame("성적 그래프 그리기");
		f.setLocation(500, 200);
		f.setPreferredSize(new Dimension(400, 350));
		Container con = f.getContentPane();
		DrawingPanel drawingPanel = new DrawingPanel();
		con.add(drawingPanel, BorderLayout.CENTER);
		
		JPanel controlPanel = new JPanel();
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		
		JButton button = new JButton("그래프 그리기");
		
		controlPanel.add(new JLabel("국어"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("영어"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("수학"));
		controlPanel.add(text3);
		
		controlPanel.add(button);
		con.add(controlPanel, BorderLayout.SOUTH);
		button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));
		
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

}
