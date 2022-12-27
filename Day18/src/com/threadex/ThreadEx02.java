package com.threadex;

class ThreadSubEx extends Thread {
	
	private String name;
	private String lastname;
	
	public ThreadSubEx(String a, String b, int x) {
		name = a; // 이름
		lastname = b; // 성9+
		setPriority(x); // 우선순위 설정
		setDaemon(true); // 데몬 스레드 
	}
	
	@Override
	public void run() {
		System.out.println(Thread.activeCount());
		int xx = Thread.activeCount();
		
		Thread[] th = new Thread[xx];
		
		Thread.enumerate(th);
		
		for(int i=0; i<th.length; i++) {
			System.out.println(th[i].getName()+ ":" + th[i].getPriority()+ ":" +th[i].isDaemon()+ ":" +th[i].isAlive());
		}
		
		while(true) {
			System.out.println("이름:" +name);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException ee) {
				ee.printStackTrace();
			}
			System.out.println("\t이름2:" +lastname);		
		}
	}
}

public class ThreadEx02 {

	public static void main(String[] args) {
		
		ThreadSubEx ts1 = new ThreadSubEx("길동", "홍", 1);
		ts1.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ThreadSubEx ts2 = new ThreadSubEx("길동", "가", 5);
		ts2.start();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
