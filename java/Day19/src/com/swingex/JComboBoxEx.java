package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxEx extends JFrame{
	
	private String[] citems = {"One", "Two", "Three", "Four", "Five"};
	
	public JComboBoxEx() {
		
		super("ComboBox Test");
		setLayout(new FlowLayout());
		JComboBox<String> combo = new JComboBox<String>(citems);
		add(combo);
		
		setBounds(300, 200, 300, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {	
		new JComboBoxEx();
	}

}
