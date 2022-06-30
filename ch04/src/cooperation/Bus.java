package cooperation;

public class Bus {
	//필드, 멤버
	int busNumber;  //버스번호
	int passenger;  //승객
	int money;      //수입
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//사람을 태우는 메서드 
	public void take(int money) {
		this.money += money;  //요금을 받고
		passenger++;         //승객수 1명 증가
	}
	
	//버스의 정보
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 수입은 " + money + 
				"원이고, 승객수는 " + passenger + "명입니다.");
	}
}