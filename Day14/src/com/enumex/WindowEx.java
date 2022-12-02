package com.enumex;

import java.awt.*;
import java.awt.event.*;

class WinEvent extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
	//	System.exit(0);
	}
}

public class WindowEx {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		WinEvent we = new WinEvent();
		
		f.addWindowListener(we);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
