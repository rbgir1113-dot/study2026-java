package synchronizedTest;

public class ATM implements Runnable{
	int money = 10000;
	
	public void withdraw(int money) {
//		synchronized (this) 에 있는 this 부분은 객체가 들어와야 한다.
//		synchronized 는 비동기에서 동기적인 흐름으로 만들어짐
//		동기 : synchronized(객체) {}
		synchronized (this) {
			this.money -= money;
		}
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
		System.out.println("현재 잔액: " + this.money + "원");
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i< 5; i++) {
			withdraw(1000);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
