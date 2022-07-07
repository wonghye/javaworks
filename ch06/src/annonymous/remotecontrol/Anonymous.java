package annonymous.remotecontrol;

public class Anonymous {
	//익명 객체 필드
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	//메서드의 로컬 변수
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("audio를 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("audio를 끕니다.");
				
			}
		};
		
		localVar.turnOn();
	}
	//메서드의 매개값
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
