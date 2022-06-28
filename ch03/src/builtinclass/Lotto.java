package builtinclass;

public class Lotto {

	public static void main(String[] args) {
		// 로또 프로그램
		
		int[]lotto = new int[6];
		int i, j ;
		System.out.println(lotto.length + "개");
		
		//로또 번호 생성
		for(i = 0; i < lotto.length; i++) {
			lotto[i]= (int)(Math.random() * 45) + 1;
			
			//중복번호 제거
			for(j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("중복 번호 : " + lotto[i] + "번 ");
					i--;
				}
			}
		}
		//로또번호 출력
		for(i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+ "번 ");
		}
	}

}
