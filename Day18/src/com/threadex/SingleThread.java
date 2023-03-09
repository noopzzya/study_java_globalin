package com.threadex;

public class SingleThread extends Thread{ // Thread : 클래스 상속받아서 생성
	
	private int[] temp;
	
	public SingleThread(String threadname) {
		
		super(threadname);
		temp = new int[10];
		
		for(int start=0; start<temp.length; start++) {
			temp[start] = start; // start:0~9
		}
		
	}
	
	@Override
	public void run() {
		
		for(int start : temp) {
			try {
				sleep(1000); // 1초에 1번씩
			}catch (InterruptedException uu) {
				uu.printStackTrace();
			}			
			System.out.printf("스레드 이름:%s", currentThread().getName());
			System.out.printf("temp value:%d%n", start);
		}
	}

	public static void main(String[] args) {
		
		SingleThread st = new SingleThread("홍길동");
		st.start(); // start 실행 시 run()으로 감

	}

}
