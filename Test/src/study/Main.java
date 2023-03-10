package study;

public class Main extends Thread{
	
	@Override
	public void run() {
		
		try {
			for(int i=0; i<20; i++) {
				Thread.sleep(100);
				System.out.println(i+ "번:" +i+ "*" +i+ "=" + (i*i));
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		Main thread = new Main();
		thread.start();
		System.out.println("Thread 종료 전 다음 코드 실행 확인");
		
	}
}