package arrayexam2;

/* 배열 복사
 *  1. 한 번 만들어진 배열의 크기는 변경할 수 없다.
 *  2. 크기를 늘리려면 같은 자료형의 배열을 원하는 크기로 준비하고 기존의 배열을 복사하면 작업을 완료할 수 있다.
 *  3. 배열을 복사하려면 System.arraycopy() 메소드를 이용한다.
 *  
 *  arraycopy()의 형식
 *  
 *  bublic static void arraycopy(
 *  Object src, int srcPos, Object dest, int destPos, int length){} // 순서형식 고정
 *  
 *  Object src : 기존배열(원본배열)
 *  int srcPos : 기존배열의 복사 시작 위치(인덱스=첨자)를 의미
 *  Object dest : 복사가 될 배열
 *  int destPos : 복사 시작 위치
 *  int length : 복사되는 배열의 길이(요소의 수)
 */

public class ArrayEx08 {

	public static void main(String[] args) {
		
		String[] src = {"Java", "DataBase", "JSP", "XML"}; // OS, Network
		String[] des = new String[6];
		
		des[0] = "OS";
		des[1] = "Network";
		
		System.arraycopy(src, 0, des, 2, 4); //새로운게 앞에 오고, 기존 배열 뒤로 옴
		
		for(String temp : des) {
			System.out.print(temp+", ");
		}
	}

}
