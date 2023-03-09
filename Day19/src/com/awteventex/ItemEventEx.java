package com.awteventex;

/* 라벨
 * 혈액형: A, B, AB, O
 * 년: 1980 ~ 2022
 * 월: 1 ~ 12
 * 일: 1 ~ 31
 * 
 * 리스트
 * 지역 : 서울, 대구, 부산, 대전, 광주, 울산, 인천, 강원
 */

import java.awt.*;
import java.awt.event.*;
public class ItemEventEx extends Frame implements ItemListener, ActionListener{

	private Label lb = new Label("혈액형:", Label.RIGHT);	
	private Label lb1 = new Label("생년월일:", Label.RIGHT);	
	private Label lb2 = new Label("지역:", Label.RIGHT);
	private TextField bType = new TextField();
	private Choice blood = new Choice();
	private TextField birth = new TextField();
	private Choice year = new Choice();
	private Choice month = new Choice();
	private Choice day = new Choice();
	private TextField area = new TextField();
	private List li = new List(3, false);
	private Button end = new Button("Exit");
	
	public ItemEventEx() {
		
		super("ItemEvent Test");
		setForm();
		
		// 편집 불가
		bType.setEditable(false);
		birth.setEditable(false);
		area.setEditable(false);
		
		// 리스너 등록
		blood.addItemListener(this);
		day.addItemListener(this);
		li.addItemListener(this);
		
		li.addActionListener(this);
		end.addActionListener(this);
		
		blood.requestFocus(); // 커서 시작 위치
		
		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
	}
	
	private void setForm() {
		
		setLayout(new GridLayout(2, 1));
		
		Panel p = new Panel(new BorderLayout());
		Panel p1 = new Panel(new GridLayout(3, 1));
		
		p1.add(lb); p1.add(lb1); p1.add(lb2);
		p.add("West", p1); // 라벨
		
		Panel p2 = new Panel(new GridLayout(3, 1));
		p2.add(bType); p2.add(birth); p2.add(area);
		p.add("Center", p2);
		
		Panel p3 = new Panel(new GridLayout(4, 1));
		p3.add(blood); p3.add(year); p3.add(month); p3.add(day);
		
		blood.add("A형"); blood.add("B형"); blood.add("AB형"); blood.add("O형");
		
		// 년
		for(int i=1980; i<=2022; i++) year.add(i+ "년");
		
		// 월
		for(int i=1; i<=12; i++) month.add(i+ "월");
		
		// 일
		for(int i=1; i<=31; i++) day.add(i+ "일");
		
		p.add("East", p3);
		
		add("Center", p); // 중앙
		
		Panel p4 = new Panel(new BorderLayout());
		p4.add("Center", li);
		li.add("서울");
		li.add("대구");
		li.add("부산");
		li.add("대전");
		li.add("광주");		
		li.add("울산");
		li.add("인천");
		li.add("강원");
		p4.add("East", end);
		add(p4);
	}
	
	public static void main(String[] args) {
		new ItemEventEx();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == end) { // 버튼
			System.exit(0);
		}else if(e.getSource() == li) { // 리스트
			int i = li.getSelectedIndex();
			li.remove(i);
		}		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getSource() == blood) {
			String imsi = blood.getSelectedItem();
			bType.setText(imsi);
		}else if(e.getSource() == day) {
			String imsi = year.getSelectedItem();
			String imsi1 = month.getSelectedItem();
			String imsi2 = day.getSelectedItem();
			birth.setText(imsi + imsi1 + imsi2);
		}else if(e.getSource() == li) {
			String imsi = li.getSelectedItem();
			area.setText(imsi+ "지역");
		}
		
	}

}
