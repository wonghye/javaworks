package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	//비프음이 재생되는 작업
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

}
