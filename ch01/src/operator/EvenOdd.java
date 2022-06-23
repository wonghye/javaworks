package operator;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 숫자를 입력받아서 짝수/홀수를 판별하는 프로그램
		// 조건 연산자 활용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수" : "홀수" ;
		//String result = (num % 2 != 0) ? "홀수" : "짝수" ;
		
		System.out.println(result); 
		
		sc.close();

	}

}
