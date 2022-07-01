package arrayobject;

public class ArrayCreatByValue {

	public static void main(String[] args) {
		int[]scores;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		
		for(int i = 0; i<scores.length; i ++) {
			sum1 += scores[i];
		}
		System.out.println("종합 : " + sum1);
		
		//add() 함수 호출
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("종합 : " + sum2);
	}
	
	//배열의 합계를 계산 하는 함수
	public static int add(int[]scores) {
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		return sum;
	}

}
