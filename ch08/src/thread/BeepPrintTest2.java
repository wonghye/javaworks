package thread;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		//메인 스레드와 작업 스레드가 동시에 실행
		//Thread - java.lang
		//Thread.sleep(ms):  대기 시간
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();  // 쓰레드 시작
		
		
		for(int i =0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);  // 1000ms ㅡ> 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	
	
	
	}
}
