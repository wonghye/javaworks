package ifexample;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		//윤년 - 4년 주기이며 100년 단위는 윤년이 아니나 400년단위는 윤년임.
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		
		if((year % 4 == 0) && (year % 100 != 0) ||(year %400 == 0) ) {
			System.out.println(year + "년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
		}
		
		sc.close();
	}

}
