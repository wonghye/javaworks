package thread;

import java.awt.Toolkit;

public class BeepPrintTest3 {

	public static void main(String[] args) {
		
		//익명 객체로 작업 스레스 생성
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();  // 사운드
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();  // 스레드 실행 (메인 스레드와 동시 실행)
		
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
