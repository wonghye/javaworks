package shelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		//리스트에 자료추가
		shelf.add(title); 
	}

	@Override
	public String deQueue() {
		 // 리스트에서 자료 삭제
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		//리스트의 요소의 개수 반환
		return shelf.size();
	}

}
