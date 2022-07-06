package exception;

public class ExceptionExample1 {

	public static void main(String[] args) {
		//null 예외 - nullpointerExcetion
		/*
		String data = null; //"하늘";
		System.out.println(data.toString());
		 */
		
		//배열의 크기 오류 - arrayinedxoutofboundsException
		int []num = new int[2];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		//데이터 포맷(형) 오류 - numberformatexception
		String data1 = "100";
		String data2 = "a200";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		
	}

}
