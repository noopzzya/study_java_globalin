package study;

public class CharEx {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		char ch2 = '\u0041';
		
		System.out.println("ch1 + ch2 = "+ch1+ch2); //AA
		System.out.println("ch1 + ch2 = "+(ch1+ch2)); //130
		
		System.out.println("ch1 + ch2 = "+(char)(ch1+ch2));
		
		
	}

}
