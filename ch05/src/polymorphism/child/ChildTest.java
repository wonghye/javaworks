package polymorphism.child;

public class ChildTest {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		//Parent parent = child;  // 자동 타입 변환
		Parent parent = new Child();
		
		parent.method1();
		parent.method2();  // 자식 클래스의 메서드가 호출됨
		// parent.methdo3(); 호출불가
		
		//강제 타입 변환
		Child child2 = (Child)parent;
		child2.method3();
		
	}

}
