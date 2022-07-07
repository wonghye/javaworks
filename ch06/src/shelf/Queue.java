package shelf;

public interface Queue {
	
	//Queue (큐) - 자료구조의 한 방식
	//먼저 들어간 자료가 먼저 나옴 (FIFO - first in first out)
	
	void enQueue(String title); //리스트의 맨 뒤에서 추가함
	
	String deQueue(); //리스트의 맨 처음 항목 반환(인덱스 0번)
	
	int getSize();  // 현재 Queue에 있는 요소의 개수 반환
	
	
}
