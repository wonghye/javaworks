package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//회원 삽입
		// key -  중복불가, value -변경가능
		memberHashMap.addMember(new Member(1004, "삼성전자"));
		memberHashMap.addMember(new Member(1002, "lg전자"));
		memberHashMap.addMember(new Member(1003, "네이버"));
		memberHashMap.addMember(new Member(1004, "카카오"));
		memberHashMap.addMember(new Member(1002, "현대자동차"));  
		
		//목록 보기
		memberHashMap.showAllMember();
		System.out.println("=============================");
		
		//회원 삭제
		memberHashMap.removeMember(1003);
		memberHashMap.removeMember(1005);
		
		memberHashMap.showAllMember();
		
		
	}

}
