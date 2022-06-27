package array;

public class ArrayCars {

	public static void main(String[] args) {
		// 문자형 배열 선언과 사용
		/*
		String[] cars = new String[4];
		
		//자료 입력
		cars[0] = "Morning";
		cars[1] = "Sonata";
		cars[2] = "Sportage";
		cars[3] = "K7";
		*/
		
		String[]cars = {"Morning","Sonata","Sportage","K7"};
		//전체 조회(인덱스 방식)
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i]+ " ");
		}
		System.out.println();
		
		//수정(Sportage -> BMW
		cars[2] = "BMW";
		System.out.print("cars[2] = " +cars[2]);
		
		System.out.println();
		
		//향상된 for(객체 방식)
		for(String car : cars) { // for(자료형 변수: 배열이름)
			System.out.print(car+ " "); // 변수 이름으로 출력함
		}
	}

}
