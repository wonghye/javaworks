package reference;

public class Student {
	//필드
	int studentId; //학번
	String studentName; //이름
	Subject korean;
	Subject math;
	
	//생성자
	public Student( int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		korean = new Subject();
		math = new Subject();
	}
	
	//수업과목 추가하는 메서드
	public void koreanSubject(String name, int scroe) {
		korean.setSubjectName(name);
		korean.setScorePoint(scroe);
	}
	
	public void mathSubject(String name, int scroe) {
		math.setSubjectName(name);
		math.setScorePoint(scroe);
	}
	
	//학생의 정보
	public void showInfo() {
		System.out.println(studentName + "의 국어 점수는 " + korean.getScorePoint()
				+ "점이고, 수학 점수는 " + math.getScorePoint() + "점입니다.");
	}
	
}
