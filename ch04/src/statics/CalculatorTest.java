package statics;

public class CalculatorTest {

	public static void main(String[] args) {
		
		//원의 넓이 계산
		double result1 = 10 * 10 * Calculator.PI;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		//인스턴스형 변수나 메서드를 사용시에는 new 객체 생성해야함
		Calculator calc = new Calculator();
		calc.num = 10;
		calc.square(3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
