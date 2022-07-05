package chap07;

public class Test7_2 extends Service{

	public static void main(String[] args) {
		//3
		/*
		 A a = new B();
		 B b = (B)a; // a가 클래스의 객체
		 */
		
		
		//5
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login();  // 멤버로그인
		
		controller.setService(new AService());
		controller.service.login();  // A로그인
	}

}
