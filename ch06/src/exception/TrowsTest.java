package exception;

class ArrayUtill{
	public void call() throws Exception {
		//런타임 예외
		System.out.println("call 메서드 시작");
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		//num[2] = 3;
		System.out.println("call 메서드 종료");
	}
}

public class TrowsTest {

	public static void main(String[] args) {
		
		ArrayUtill util = new ArrayUtill();
		
		try {
			util.call();
			System.out.println("안녕하세요~");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("main 메서드에서 예외 처리");
		}
		System.out.println("감사합니다.");
	}

}
