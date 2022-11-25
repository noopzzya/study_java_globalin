package arrayexam2;

/*
 *  배열의 복사
 *  
 *  -- 배열 변수의 복사는 데이터 복사, 주소값 복사
 *  -> 원본을 수정하면 복사본에 영향을 미친다
 *  -> 모든 참조형에 해당하는 복사
 *      값만 바뀌면 얕은 복사
 */

public class ArrayEx09 {

	public static void main(String[] args) {
		
		int[] nums = {10,20,30,40,50};
		int[] copy;
		int temp;
		copy = nums; //주소 복사
		System.out.println(copy.length);
		temp = nums[0]; // 10
		System.out.println(temp);
		nums[0] = 1000; // 원본 수정
		System.out.println(nums[0]);
		for(int i=0; i<copy.length; i++) {
			System.out.printf("%3d\t", copy[i]);
		}System.out.println();
		
		copy[0] = 2000;
		
		for(int i=0; i<copy.length; i++) {
			System.out.printf("%3d\t", copy[i]);
			// 원본을 수정하면 복사본에  영향을 미친다 
			
		}
		
	}

}
