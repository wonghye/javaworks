package collection.member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Dao 생성
public class MemberHashSet {
	
	private Set<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	//회원추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//회원 목록 보기
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		/*
		//반복자 객체 얻기
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) { // 자료가 있으면(true) 실행됨
			Member member = ir.next();  // 1개의 객체를 가져와서 
			System.out.println(member);
		}
		*/
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int dbMemberId = member.getMemberId();  // 이미 저장된 id를 가져옴
			if(dbMemberId == memberId) { // 외부입력 member id와 같으면
				hashSet.remove(member);  // 해당 객체 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "번 회원이 존재하지 않습니다.");
		return false;
	}
	
}
