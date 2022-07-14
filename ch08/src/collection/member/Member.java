package collection.member;

//VO 객체자료
public class Member {
	
	private int memberId;  //회원아이디
	private String memberName;  //회원이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getMemberId() {
		return memberId;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}


	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}


	@Override
	public int hashCode() {
		return memberId;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member =  (Member)obj;
			if(member.memberId == memberId) {
					//this.memberId == member.memberId) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
