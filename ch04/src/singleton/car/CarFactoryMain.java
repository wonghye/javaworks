package singleton.car;

public class CarFactoryMain {

	public static void main(String[] args) {
		//공장 객체 1개 생성
		CarFactory factory = CarFactory.getInstance();
		
		//공장에서 차를 생산
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		Car herSonata = factory.createCar();
		
		System.out.println("sonata : " + mySonata.getCarNum());
		System.out.println("sonata : " + yourSonata.getCarNum());
		System.out.println("sonata : " + herSonata.getCarNum());
	}

}