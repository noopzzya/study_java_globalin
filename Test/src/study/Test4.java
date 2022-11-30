package study;

public class Test4 {

	public static void main(String[] args) {
		
		int arr[][] = new int[5][4];
		int n=1;
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = 4*j+n;	
//			}
//			n++;			
//		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = n;	
				n++;	
			}	
		}
		
		
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}

	}

}
