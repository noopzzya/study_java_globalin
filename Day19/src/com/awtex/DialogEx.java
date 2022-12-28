package com.awtex;

import java.awt.*;
public class DialogEx extends Frame {

	// 컴포넌트 정의
	private Dialog d = new Dialog(this, "조회 서비스", false);
	
	private Label dla1 = new Label("이름과 주민번호로 비밀번호 찾기");
	private Label dla2 = new Label("이름", Label.RIGHT);
	private Label dla3 = new Label("주민번호", Label.RIGHT);
	private Label dla4 = new Label("-", Label.CENTER);
	
	private TextField dtf1 = new TextField(20);
	private TextField dtf2 = new TextField(6); // 주민번호 앞자리
	private TextField dtf3 = new TextField(7); // 주민번호 뒷자리
	
	private Button dbt1 = new Button("찾기");
	private Button dbt2 = new Button("취소");
	
	public DialogEx() {
		
		super("Dialog Test");
		
		setDialog();
		
		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
		d.setVisible(true);
		
	}
	
	private void setDialog() {
		
		d.setLayout(new BorderLayout());
		d.add("North", dla1);
		
		Panel p1 = new Panel(new BorderLayout());
		Panel p2 = new Panel(new GridLayout(2, 1));
		
		p2.add(dla2);
		p2.add(dla3);	
		p1.add("West", p2);
		
		Panel p3 = new Panel(new GridLayout(2, 1));
		Panel tfPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));		
		
		tfPanel.add(dtf1);
		p3.add(tfPanel);		
		
		p4.add(dtf2);
		p4.add(dla4);
		p4.add(dtf3);
		
		p3.add(tfPanel);
		p3.add(p4);
		
		p1.add("Center", p3);
	
		Panel p = new Panel(new FlowLayout());
		p.add(dbt1);
		p.add(dbt2);
		
		d.add("Center", p1);
		d.add("South", p);
				
		d.setSize(260, 150);
		d.setResizable(false);
		
	}
	
	public static void main(String[] args) {
		DialogEx d =  new DialogEx();
	}

}
