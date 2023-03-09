package com.project;

import java.util.*;
import javax.swing.table.*;

public class EmployeeModel extends AbstractTableModel{
	
	Object[][] data;
	Object[] columnName;
	
	EmployeeDAO emDao = new EmployeeDAO();
	EmployeeVO emVo;
	
	ArrayList<String> title;
	ArrayList<EmployeeVO> list;
	
	
	public EmployeeModel() {
		
		title = emDao.getColumnName();
		columnName = title.toArray();
		
		int columnCount = title.size();
		
		list = emDao.getEmployeetotal(); // 리스트 반환
		int rowCount = list.size();
		
		data = new Object[rowCount][columnCount];
		
		for(int index=0; index<rowCount; index++) {
			emVo = list.get(index);
			data[index][0] = emVo.getNo();
			data[index][1] = emVo.getName();
			data[index][2] = emVo.getJobGrade();
			data[index][3] = emVo.getDepartment();
			data[index][4] = emVo.getEmail();								
		}		
	}

	@Override
	public int getRowCount() {
		if(data == null)
			return 0;
			else
				return data.length;
	}

	@Override
	public int getColumnCount() {
		if(columnName == null)
			return 0;
		else
			return columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex]; // 행과 열 리턴
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return (String)columnName[column];
	}

	
}
