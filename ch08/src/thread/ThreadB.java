package thread;

public class ThreadB extends Thread {
	
	//setName과 getName thread의 메소드 
	public ThreadB() {
		setName("ThreadB");  //  스레드 이름 설정
	}

	@Override
	public void run() {
		System.out.println(getName() + "가 출력한 내용");
	}
	
	
}
