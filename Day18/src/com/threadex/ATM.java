package com.threadex;

public class ATM implements Runnable {

	private long depositeMoney = 10000;
	
	public long getDepositeMoney() {
		return depositeMoney;
	}

	@Override
	public void run() { // 동기화
	
		synchronized (this) {
			for(int i=0; i<10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if(getDepositeMoney() <= 0) break;
				// 0이 아니면 출금 가능
				withDraw(1000);
				
				// 동기화 해결
				if(getDepositeMoney() == 2000 || 
					getDepositeMoney() == 4000 || 
					getDepositeMoney() == 6000 || 
					getDepositeMoney() == 8000) {					
					try { 
						this.wait();
					} catch (InterruptedException ee) {
						ee.printStackTrace();
					}
				}else {
					this.notify();
				}
			}
		}

	}
	
	public void withDraw(long howMuch) {
		if(getDepositeMoney() > 0) { // 돈 있을 경우
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName()+ ", ");
			System.out.printf("잔액 : %d원%n", getDepositeMoney());
		}else { // 없을 경우
			System.out.print(Thread.currentThread().getName()+ ", ");
			System.out.println("잔액이 부족합니다.");
		}
	}

}
