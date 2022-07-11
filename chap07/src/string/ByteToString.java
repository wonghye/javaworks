package string;

public class ByteToString {

	public static void main(String[] args) {
		
		
		byte[] bytes = {72, 101,108,108,111, 32, 74,97,118,97};
		
		//byte 코드를 문자열로 변환
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//6번 인덱스 4개를 추출
		String str2 = new String(bytes , 6, 4);
		System.out.println(str2);
	}

}
