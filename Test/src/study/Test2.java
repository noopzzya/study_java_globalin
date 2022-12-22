package study;

public class Test2 {

	public static void main(String[] args) {
		
		int [][] arr = new int[4][5];
		int n = 1;
		/*
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = n;
				n++;
			}
		}
		*/
		
		for(int i = 0; i < arr.length;i++){
			if(i % 2== 0) {
		        for(int j = 0; j < arr[i].length; j++){
				arr[i][j]=n++;
			    }
			}else {
				for(int j = (arr[i].length-1); j >=0 ; j--){
					arr[i][j]=n++;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
