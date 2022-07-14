package generic.box2;

import generic.box.Apple;

public class GenericBoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("good Luck!");
		String msg =(String) box.get(); // object형으로 반환,강제형변환
		System.out.println(msg);
		
		//apple 클래스 사용
		box.set(new Apple("사과"));
		Apple apple = (Apple)box.get();
		System.out.println(apple);
	}

}
