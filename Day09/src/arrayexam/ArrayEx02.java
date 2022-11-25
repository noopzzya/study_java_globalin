package arrayexam;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		//System.out.println(args[0]);
		for (int i =0; i<args.length; i++) {
			//System.out.println(args[i]);
			System.out.println((i+1)+"번째 과목:" + args[i]);
		}

	}

}
