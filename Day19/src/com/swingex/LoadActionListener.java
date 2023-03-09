package com.swingex;

import javax.swing.*;
import java.awt.event.*;


public class LoadActionListener implements ActionListener {

	JTextField text;
	ImagePanel imagePanel;
	
	public LoadActionListener(JTextField text, ImagePanel imagePanel) {
		this.text = text;
		this.imagePanel = imagePanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		imagePanel.setPath(text.getText());
		imagePanel.repaint();
	}

}
