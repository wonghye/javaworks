package singleton;

public class Singleton {
	//Singleton 객체 생성( new로 생성하지 않음)
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	//getInstance ()메서드
	public static Singleton getInstance() {
		return singleton;
	}
	
}
