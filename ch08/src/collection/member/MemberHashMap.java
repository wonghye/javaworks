package collection.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//DAO
public class MemberHashMap {
	
	//hashMap객체 생성
	Map<Integer, Member> hashMap; 
	
	public MemberHashMap() {
		hashMap = new HashMap<>(); 
	}
	
	//회원 추가
	public void addMember(Member member) {
		//key, value로 저장
		hashMap.put(member.getMemberId(), member);
	}
	
	//회원 목록 보기
	public void showAllMember() {
		//반복자 객체 얻기
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();  // key를 가져와서
			Member member = hashMap.get(key);  // 키로부터 value 가져옴
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { // 입력받은 member id 가 있다면
			hashMap.remove(memberId);  // 해당 회원 삭제
			return true;
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다.");
		return false;
	}
	
}
