package ifexample;

public class AdmissionFee {

	public static void main(String[] args) {
		// 
		int age = 9;
		int fee; 
		
		if( age < 8) {
			fee =  1000;
			System.out.println("취학 전 아동입니다.");
		}else if (age>=8 && age < 14) {
			fee = 2000;
			System.out.println("초등학생입니다.");
		}else if(age >=14 && age < 20) {
			fee = 2500;
			System.out.println("중,고등학생 입니다.");
		}else {
			fee = 3000;
			System.out.println("일반인 입니다.");
		}
		//System.out.println("입장료는 " + fee + "원 입니다.");
		System.out.printf("입장료는 %,d원 입니다.", fee);

	}

}
