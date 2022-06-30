package chap03;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		// 1
		byte b =5;
		b =(byte) (b-b); // -b가 -5가 되면서 int형 변환됨
		
		//2
		int x =10;
		int y = 20;
		int z = (++x) + (y--); // 11 + 20
		System.out.println(z); // 31
		
		//3
		boolean stop = false;
		int i = 0;
		while(!stop) {
			i++;
			System.out.println("실행");
			if(i == 10)
			break;
		}
		
		//4
		int pencils = 543;
		int students = 30;
		
		//학생 한명이 가지는 연필 개수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 개수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		
		//5
		int var1 = 5, var2 = 2;
		double var3 = (double)var1 /var2;
		int var4 = (int)(var3 * var2);
		System.out.println(var4);
		
		
		//6
		int value = 356;
		System.out.println(value - 56);
		
		
		//7
		float v1 = 10f;
		float v2 = (float)v1 / 100;
		System.out.println(v2);
		if(v2 == 0.1) {
			System.out.println("10% 입니다.");
		}else {
			System.out.println("10%가 아닙니다.");
		}
		
		
		//8
		//사다리꼴 넓이 =  (위변 + 아랫변) * 높이 / 2
		int lengthTop = 5;
		int lenghBottom = 10;
		int height = 7;
		//double area = (double)(lengthTop + lenghBottom) * height / 2;
		double area = (lengthTop + lenghBottom) * height / 2.0;
		System.out.println(area);
		
		
		//9
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		double n1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("두번째 수 : ");
		double n2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("-------------------");
		if(n2 == 0 || n2 == 0.0) {
			System.out.println("결과 : 무한대");
		}else {
			System.out.println("결과 : " + (n1/n2));
		}
		sc.close();
		
		
		//10
		int vv1= 10, vv2 = 3, vv3 = 14;
		double vv4 = vv1 * vv1 * Double.parseDouble(vv2 + "." + vv3);
		//반지름 * 반지름 * 3.14
		System.out.println("원의 넓이" + vv4);
		
		//11
		System.out.print("아이디");
		String name = sc.nextLine();
		
		System.out.print("패스워드");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패 : 패스워드 틀림");
			}
		}else {
			System.out.println("로그인 실패: 아이디가 존재하지 않습니다.");
		}
		sc.close();
		
		//12
		int num1 = 10, num2 = 5;
		System.out.println((num1 > 7) && (num2 <= 5)); //true
		System.out.println((num1 % 3 == 2) || (num2 % 2 != 1)); // false
		
		
		//13
		int val = 0;
		val += 10;  //10
		val -= 10;  //0
		val *= 10;  //0
		val /= 10;  //0
		System.out.println(val);
		
		
		//14
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result); //가
		
	} // main

} // class
