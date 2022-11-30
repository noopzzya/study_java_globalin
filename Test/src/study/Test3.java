package study;

public class Test3 {

	public static void main(String[] args) {
		
		int arr[][] = new int[4][5];
		int n=20;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = -4*j+n;			
			}			
			n--;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
}
