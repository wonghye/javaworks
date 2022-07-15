package thread;

//스레드 만드는 방법 - thread 클래스 상속
public class ThreadA extends Thread {
	//setName과 getName thread의 메소드 
	public ThreadA() {
		setName("ThreadA");  //  스레드 이름 설정
	}

	@Override
	public void run() {
		System.out.println(getName() + "가 출력한 내용");
	}
	
	
}
