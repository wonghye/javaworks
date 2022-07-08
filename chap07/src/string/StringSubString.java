package string;

public class StringSubString {

	public static void main(String[] args) {
		//subString(begin, end) - start부터 end까지 문자 추출
		
		String ssn = "991125-2345678";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println("주민등록번호 앞 : "+firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println("주민등록번호 뒤 : " + secondNum);
	}

}
