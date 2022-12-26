package com.threadex;

class ThreadSub extends Thread{ // 클래스상속
	
	@Override
	public void run() {
		for(char ch='A'; ch<='z'; ch++) {
			System.out.println(ch);
			try {
				sleep(150);
			//	join(); // join 먼저 실행 후 Thread 메인
			}catch(InterruptedException ee) {
				ee.printStackTrace();
			}
		}
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		
		ThreadSub ts = new ThreadSub();
		ts.start(); // Thread 메인 >  run() 순서로 출력
		for(int i=1; i<=60; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(150);
			} catch (InterruptedException ii) {
				ii.printStackTrace();
			}
		}

	}

}
