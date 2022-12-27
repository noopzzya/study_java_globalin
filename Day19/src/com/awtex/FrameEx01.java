package com.awtex;

import java.awt.*; // 라이브러리
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class FrameEx01 extends Frame  {
	
	/*
	// implements WindowListener
	// 프레임 객체 생성 2번째 방법 (현재 클래스 인터페이스 상속해서 이용)
	public FrameEx01() {		
		super("이벤트1"); // 부모 생성자 키워드
		setSize(300, 200);
		setVisible(true); // false 일 경우 안 보임
		addWindowListener(this);		
	}
	*/
	
	/*
	// 프레임 객체 생성 3번째 방법 (내부 클래스 이용)	
	public FrameEx01() {
		super("이벤트1"); // 부모 생성자 키워드
		setSize(300, 200);
		setVisible(true); // false 일 경우 안 보임
		WinEventEx01 ww = new WinEventEx01();
		addWindowListener(ww);		
	}
	class WinEventEx01 extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	*/
	
	// 프레임 객체 생성 4번째 방법 (익명 클래스 이용)
	public FrameEx01() {
		super("이벤트1"); // 부모 생성자 키워드
		setSize(300, 200);
		setVisible(true); // false 일 경우 안 보임
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});		
	}
	
	public static void main(String[] args) {
		
		new FrameEx01(); // 2,3,4번째 방법
		
		// 프레임 객체 생성 1번째 방법 (상속받은 추상클래스 객체 이용)
		/*
		Frame f = new Frame();
		WinEvent w = new WinEvent(); // 창닫기		
		f.setSize(300, 200);
		f.setVisible(true); // false 일 경우 안 보임
		f.addWindowListener(w);
		*/
	
	}

	/* 2번째 방법
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	 */
}
