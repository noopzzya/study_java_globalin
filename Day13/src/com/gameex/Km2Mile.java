package com.gameex;

/*문3]
	Converter 클래스를 상속받아 Km를 mile(마일)로 변환하는 Km2Mile 클래스를 작성하시오.
		
		main()	
		public static void main(String[] args{
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6Km
		toMile.run();
		}
	
	출력 
	Km를 Mile로 바뀝니다.
	Km를 입력하세요. >> 30
	변환결과 : 18.75mile
 */

public class Km2Mile extends Converter{
	
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}	

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6Km
		toMile.run();

	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "ile";
	}

}
