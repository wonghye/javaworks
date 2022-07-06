package interface_polymorphism;

public class Car {
	//필드 - 인터페이스타입으로 객체 생성
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backLeftTire = new HanTire();
	Tire backRightTire = new HanTire();
	
	//메서드
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
