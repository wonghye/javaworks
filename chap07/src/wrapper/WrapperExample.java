package wrapper;

import java.util.ArrayList;

public class WrapperExample {

	public static void main(String[] args) {
		
		//int n = 10;
		
		Integer num1 = 100;  //박싱(boxing) - (자동형변환 -> 클래스형)
		int num2 = 200;
		int sum = num1.intValue() + num2;  // 언박싱(객체 -> 기본형)
		System.out.println(sum);
		
		//ValueOf() : 문자열을 숫자로 변환하는 메서드
		Integer n1 = Integer.valueOf("300");
		System.out.println(n1); //300
		
		//parseInt() : 문자열을 정수로 반환
		int n2 = Integer.parseInt("400");
		System.out.println(n2);
		
		//Integer Type 으로 사용
		ArrayList<Integer> numList = new ArrayList<>();
		
		//정수 저장
		numList.add(1);
		numList.add(2);
		numList.add(3);
		
		//출력
		for(Integer num : numList)
			System.out.println(num + "  ");
	}

}
