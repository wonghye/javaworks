package chap09;

public class Test9_1 {

	public static void main(String[] args) {
		// 3
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
		
		
		//4
		//nickname 변경 할수없음
		//String nickName = chatid;
		
		//5
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}

}
