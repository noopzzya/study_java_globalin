package com.enumex;

public class EnumEx01 {

	private Color myColor = Color.Red;	
	
	protected Color getMyColor() {
		return myColor;
	}

	protected void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public static void main(String[] args) {

		EnumEx01 ee = new EnumEx01();
		ee.setMyColor(Color.Green);
		Color color = ee.getMyColor();
		
		switch (color) {
		case Red:
			System.out.println("Red");
		break;
		case Green:
			System.out.println("Green");
		break;
		case Blue:
			System.out.println("Blue");
		break;
		}
	}

}
