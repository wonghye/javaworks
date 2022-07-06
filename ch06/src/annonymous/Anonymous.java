package annonymous;

public class Anonymous {
	
	//필드 - 익명 객체 대입
	Person field = new Person() {
		
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	
	//로컬 변수값 대입
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
			
		};//세미콜론 필수
		localVar.wake();
	}//메소드 닫기
	
	//메서드의 매개변수로 객체 전달
	void method2(Person person) {
		person.wake();
	}
	
}
