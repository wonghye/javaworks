package shelf;

public class ShelfMain {

	public static void main(String[] args) {
		
		//BookShelf bookShelf = new BookShelf();
		//인터페이스 타입으로 객체를 생성
		Queue shelfQueue = new BookShelf();
		
		//자료 삽입
		shelfQueue.enQueue("반응형 웹");
		shelfQueue.enQueue("혼공 java");
		shelfQueue.enQueue("스프링부트");
		
		
		//자료의 개수
		System.out.println("현재 책의 수 : "+ shelfQueue.getSize()+ "권");
		
		//자료 삭제
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		 
	}

}
