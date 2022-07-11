package chap02;

import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		
		//1.
				String name = "감자바";
				int age = 25;
				String tel1="010", tel2="123", tel3="4567";
				
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
				System.out.println("전화: " + tel1 + "-" + tel2 + "-" + tel3);
				
				//2.
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("첫번째 수: ");
				String strNum1 = scanner.nextLine();
				//int num1 = scanner.nextInt();
				
				System.out.println("두번째 수: ");
				String strNum2 = scanner.nextLine();
				//int num2 = scanner.nextInt();
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				int result = num1 + num2;
				System.out.println("덧셈 결과:" + result);
				
				//3
				System.out.println("[필수 정보 입력]");
				
				System.out.print("1. 이름: ");
				String naming = scanner.nextLine();
				System.out.println(naming);
				
				System.out.print("2. 주민번호 앞 6자리: ");
				String jumin = scanner.nextLine();
				System.out.println(jumin);
				
				System.out.print("3. 전화번호: ");
				String phone = scanner.nextLine();
				System.out.println(phone);
	}

}
