package innerinterface;

public class CallListener implements Button.OnClickListener  {

	//Button 클래스 내부의 인터페이스를 접근
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
