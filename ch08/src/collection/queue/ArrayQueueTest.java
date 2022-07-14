package collection.queue;

public class ArrayQueueTest {

	public static void main(String[] args) {
		//큐는 FIFO( 선입선출)
		MyQueue queue = new MyQueue();
		
		//자료넣기
		queue.enQueue("A"); //0
		queue.enQueue("B"); //1
		queue.enQueue("C"); // 2
		
		System.out.println("총 객체수: " + queue.getSize());  //3
		
		//자료 꺼내기(삭제)
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());  //-1 : 리스트 범위 초과
		
	}

}
