package arrayobject;

public class DeepCopy {

	public static void main(String[] args) {
		Book[]array1 = new Book[3];
		Book[]array2 = new Book[3];
		
		
		//array1의 데이터
		array1[0] = new Book("혼공 자바", "신용권");
		array1[1] = new Book("반응형 웹", "조혜경");
		array1[2] = new Book("스프링부트", "채규태");
		
		//array2의 데이터는 기본 생성자로 생성
		array2[0] = new Book();
		array2[1] = new Book();
		array2[2] = new Book();
		
		//array1의 요소를 array2에 복사
		for(int i =0; i <array1.length;i++) {
			array2[i].setBookName(array1[i].getBookName());
			array2[i].setAuthor(array1[i].getAuthor());
		}
		
		//array1의 요소 수정
		array1[0].setBookName("미생");
		array1[0].setAuthor("윤태호");
		
		//출력
		System.out.println("==== array1 출력 ====");
		for(int i = 0; i < array2.length; i++) {
			array1[i].showInfo();
		}
		
		System.out.println("==== array2 출력 ====");
		for(int i = 0; i < array2.length; i++) {
			array2[i].showInfo();
		}
	}

}
