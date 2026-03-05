package threadTest;

public class Thread1 extends Thread{
	public String data;
	
	public Thread1() {;}
	public Thread1(String data) {
		this.data = data;
	}

//	run
	@Override
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println(data);
			
//			alt + shift + z 로 try catch 구역 생성 (원하는 구역 드래그 후)
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
