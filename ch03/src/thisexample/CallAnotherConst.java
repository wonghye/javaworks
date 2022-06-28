package thisexample;

class Person{
	String name;
	int age;
	
	Person(){ // 아래 Person 생성자를 호출함
		this("이름 없음" , 1);
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//void setName(String name) {
		//this.name = name;
	//}
	
	//객체를 반환하는 함수
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person noName = new Person();
		Person son = new Person("손흥민", 31);
		//noName.name = "이름 없음";
		System.out.println(noName.name);
		System.out.println(son.name);
		
		Person p = noName.returnItSelf(); //객체를 반환받음
		
		System.out.println(p);
		System.out.println(noName);
	}

}
