package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class BorderEx01 extends JFrame{
	
	private JButton[] jb = new JButton[6];

	public BorderEx01() {
		
		super("Border Test");
		Container con = this.getContentPane(); // this 생략가능
		con.setLayout(new GridLayout(3, 2, 5, 5));
		
		for(int i=0; i<6; i++) {
			jb[i] = new JButton(i+ "번 버튼");
			con.add(jb[i]);
		}
		
		EmptyBorder eb = new EmptyBorder(10, 10, 10, 10); // EmptyBorder : 테두리선 없음
		jb[0].setBorder(eb);
		
		LineBorder lb = new LineBorder(Color.red, 5); // LineBorder : 컬러, 선굵기 지정
		jb[1].setBorder(lb);
		
		EtchedBorder eb1 = new EtchedBorder(); // EtchedBorder : 홈 파여있는 테두리
		jb[2].setBorder(eb1);
		
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED); // BevelBorder : 튀어나온 테두리
		jb[3].setBorder(bb);
		
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED); // SoftBevelBorder : 들어간 테두리
		jb[4].setBorder(sbb);
		
		MatteBorder mb = new MatteBorder(5, 10, 15, 20, Color.green); // MatteBorder : 테두리 크기 조정
		jb[5].setBorder(mb);
		
		setSize(new Dimension(300, 200));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
	}
	
	public static void main(String[] args) {
		
		new BorderEx01();

	}

}
