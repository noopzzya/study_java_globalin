package arrayexam2;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		String strSrc[] = {new String("Test1"), new String("Test2"), new String("Test3")};

		for(int i=0; i < strSrc.length; i++) {
			System.out.println(strSrc[i]);
		}
		
		String strDest[] = new String[strSrc.length+2];
		System.out.println();
		System.arraycopy(strSrc, 0, strDest, 2, 3);
		
		System.out.print("strSrc:");
		for(String str : strSrc)
			System.out.print(str+" ");
		
		System.out.println();
		System.out.print("strDest:");
		for(String str : strDest)
			System.out.print(str+" ");

	}

}
