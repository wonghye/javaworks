package classpart;

public class Person {
	//필드
	String name;
	float height;
	float weight;
	
	//기본 생성자
	public Person(){
		System.out.println("사람을 생성합니다.");
	}
	
	//매개변수가 있는 생성자
	public Person(String n) { // 이름을 외부에서 매개로 전달
		System.out.println("사람을 생성합니다.");
		name = n;
	}
	
	public Person(String n, float h , float w) { // 이름을 외부에서 매개로 전달
		name = n;
		height = h;
		weight = w;
		System.out.println("사람을 생성합니다.");
	}
	
	//메서드
	public void showInfo() {
		System.out.println("이름 : " + name + ", 키 : " + height + ", 몸무게 : " + weight);
	}
}
