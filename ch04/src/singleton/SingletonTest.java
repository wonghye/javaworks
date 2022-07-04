package singleton;

public class SingletonTest {

	public static void main(String[] args) {

		//Singleton obj3 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {  // 객체의 주소 비교
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Sigleton 객체입니다.");
		}
	}

}
