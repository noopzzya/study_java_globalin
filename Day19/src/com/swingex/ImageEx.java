package com.swingex;

import java.awt.*;
import javax.swing.*;

public class ImageEx {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("이미지 로딩");
		f.setLocation(500, 200);
		f.setPreferredSize(new Dimension(500, 400));
		Container con = f.getContentPane();
		
		ImagePanel imagePanel = new ImagePanel();
		con.add(imagePanel, BorderLayout.CENTER);

		JPanel controlPanel = new JPanel();
		JTextField text = new JTextField(30);
		JButton button = new JButton("이미지 로드");
		
		controlPanel.add(text);
		controlPanel.add(button);
		con.add(controlPanel, BorderLayout.SOUTH);
		
		button.addActionListener(new LoadActionListener(text, imagePanel));
		
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

}
