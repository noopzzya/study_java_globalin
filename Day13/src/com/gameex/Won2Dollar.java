package com.gameex;

/*
	문2]
	Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하시오 
	
	main()
	
	public static void main(String[] args{
	Won2Dollar toDollar = new Won2Dollar(1200); // 1달러를 1200으로 가정
	toDollar.run();
	}
	
	출력
	원을 달러로 바꿉니다.
	원을 입력하세요:24000
	변환 결과 : 20.0달러입니다.
 */

public class Won2Dollar extends Converter{

	public Won2Dollar(double ratio) {
		this.ratio = ratio; // 추상클래스라 this
	}
	
	public static void main(String[] args) {
		
		Won2Dollar toDollar = new Won2Dollar(1200); 
		toDollar.run();	
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}

}
