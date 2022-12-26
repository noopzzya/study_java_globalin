package com.threadex;

// SingleThread와 동일
public class SingleRunnableEx implements Runnable{ // Runnable : 인터페이스 구현하여 생성

	private int[] temp;
	
	public SingleRunnableEx() {
		
		temp = new int[10];
		
		for(int start=0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
		
	public static void main(String[] args) {	
		
		SingleRunnableEx srt = new SingleRunnableEx();
		Thread t = new Thread(srt, "홍길동");
		t.start();
	}

	@Override
	public void run() {
		
		for(int start : temp) {
			try {
				Thread.sleep(1000); // 1초에 1번씩
			}catch (InterruptedException uu) {
				uu.printStackTrace();
			}			
			System.out.printf("스레드 이름:%s", Thread.currentThread().getName());
			System.out.printf("temp value:%d%n", start);
		}
	}


}
