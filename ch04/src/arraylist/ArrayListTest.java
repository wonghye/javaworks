package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// 자료 구조 - ArrayList 클래스 사용
		ArrayList<String> cart = new ArrayList<>();
		
		//String[]cart2 = new String[10]; 배열
		
		//자료 입력(저장)
		cart.add("커피");
		cart.add("생수");
		cart.add("계란");
		
		//리스트의 크기
		System.out.println("장바구니 품목 : " +cart.size() + "개");
		
		//ArrayList의 특정요소를 1개 출력 객체이름.get(index)
		System.out.println(cart.get(2));

		//전체 조회
		for(int i = 0; i< cart.size(); i++) { // 리스트의 크기만큼 반복
			String c = cart.get(i);  // 요소를 가져와서
			System.out.println(c);   // 출력
		}
		
		System.out.println();
		
		//자료 삭제 - 생수
		cart.remove(1);
		
		//자료 수정 - 커피 ㅡ> 라면
		cart.set(0 , "라면");
		
		//향상 for문 조회
		for(String c : cart)
		System.out.println(c);
	}

}
