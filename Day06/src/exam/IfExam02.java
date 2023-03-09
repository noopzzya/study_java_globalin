package exam;

import java.util.*;

public class IfExam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int su1, su2, su3, su4, su5, sum, avg;
		System.out.print("과1 점수 입력 : ");
		su1 = sc.nextInt();
		System.out.print("과2 점수 입력 : ");
		su2 = sc.nextInt();
		System.out.print("과3 점수 입력 : ");
		su3 = sc.nextInt();
		System.out.print("과4 점수 입력 : ");
		su4 = sc.nextInt();
		System.out.print("과5 점수 입력 : ");
		su5 = sc.nextInt();
		
		sum = su1 + su2 + su3 + su4 + su5;
		avg = (int)(sum/5);
		
		if(avg>=60) {
			if(su1>=40 && su2>=40 && su3>=40 && su4>=40 && su5>=40) {
				System.out.println("이번 시험에 합격하셨습니다. 축하드립니다.");
			} else {
				System.out.println("과락 발생으로 인하여 불합격 하셨습니다.");
			}
		} else {
			System.out.println("불합격하셨습니다. 다음 기회에 다시 응시 하십시오.");
		}
		
	}
}
