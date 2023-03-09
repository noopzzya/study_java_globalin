package com.swingex;

import java.awt.*;
import javax.swing.*;

public class GraphicEx01 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("자동차 그리기");
		f.setLocation(500, 200);
		f.setPreferredSize(new Dimension(400, 300));
		Container con = f.getContentPane();
		
		CarDrawingPanel drawingPanel = new CarDrawingPanel();
		con.add(drawingPanel);
		
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
