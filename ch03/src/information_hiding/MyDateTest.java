package information_hiding;

public class MyDateTest {

	public static void main(String[] args) {
		// MyDate 클래스의 객체 생성
		MyDate date = new MyDate();
		//date.day = 20;
		date.setYear(2020);
		date.setMonth(2);
		date.setDay(28);
		
		System.out.println("나의 생일은 " + date.getYear() + "년 " +
				date.getMonth() + "월 " + date.getDay() + "일 입니다." );

	}

}
