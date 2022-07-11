package string;

public class StringReplace {

	public static void main(String[] args) {
		
		//replace("변경전 문자열", "변경후 문자열")
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바" , "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
