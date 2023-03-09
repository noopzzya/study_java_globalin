package com.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FindPane extends JPanel implements ActionListener {
	
	// swing 관련 멤버 필드 선언
		private JPanel jp[] = new JPanel[6];
		private JLabel jl[] = new JLabel[5];
		private JTextField tf[] =new JTextField[5];
		
		private JButton okb; // 저장버튼
		private JButton rsb; // 리셋버튼
		
		String[] caption = {"번호:", "이름:", "직책:", "부서:", "메일:"};
	
	public FindPane() {
		
		setLayout(new GridLayout(7, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
		int size = caption.length;
		
		int i;
		for(i=0; i<size; i++) {
			jp[i] = new JPanel(); // 전체적인 panel
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			
			add(jp[i]);
			
			tf[i].setEditable(false);
			
			if(i == 0 || i == 1)
				tf[i].setEditable(true);
		}
		
		jp[size] = new JPanel();
		
		okb = new JButton("사원정보조회");
		okb.addActionListener(this);
		
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);
		
		jp[size].add(okb);
		jp[size].add(rsb);
		add(jp[i]); // i값에 추가
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String ae_type = ae.getActionCommand();
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;
		
		if(ae_type.equals(okb.getText())) {
			
			try {
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();
				
				if(!sno.equals("") && !sname.equals("")) {
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
					
				}else if(!sno.equals("") && sname.equals("")) {
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
					
				}else if(sno.equals("") && !sname.equals("")) {
					evo = edvo.getEmployeeName(sname);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(evo != null) {
				tf[0].setText(evo.getNo()+ "");
				tf[1].setText(evo.getName()+ "");
				tf[2].setText(evo.getJobGrade()+ "");
				tf[3].setText(evo.getDepartment()+ "");
				tf[4].setText(evo.getEmail()+ "");
			}else {
				JOptionPane.showMessageDialog(this, "검색 실패!");
			}
			
		}else if(ae_type.equals(rsb.getText())) {
			
			int size = caption.length;
			for(int i=0; i<size; i++) {
				tf[i].setText("");
			}
		}
		
	}

}
