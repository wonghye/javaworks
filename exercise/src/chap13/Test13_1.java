package chap13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test13_1 {

	public static void main(String[] args) {
		//5
		List<Board> arraylist = new ArrayList<>();
		
		//6
		//Map<String, Integer> map = new HashMap<>();
		
		
		//7
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + " - " + board.getContent());
		}
		
		//8
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));  // 학번이 같으므로 저장되지않음
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
		
		
		
		
	}

}
