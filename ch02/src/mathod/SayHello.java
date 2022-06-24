package mathod;


public class SayHello {

	public static void main(String[] args) {
		
		// 함수 호출
		//함수 오버로딩 -함수 이름 같아도 매개변수나 자료형이 다르면 사용할 수 없음
		sayHello();
		sayHello("minsu ");
		sayHello("sooyoung");
	}
	
	// 함수의 정의(void - 반환값 x)
	//static 사용하는 이유: 객체(클래스 사용 x)생성을 하지 않으므로 
	public static void sayHello() {
		System.out.println("Hello~ Java");
	}
	
	//매개변수가 있는 void형 함수
	public static void sayHello(String name) {
		System.out.println("Hello~ " + name);
	}
	

}
