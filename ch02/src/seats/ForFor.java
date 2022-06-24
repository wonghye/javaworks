package seats;

public class ForFor {

	public static void main(String[] args) {
		// 12345 / 678910 / 11 12 13 14 15 / ... 
		
		int i,j;
		for(i =0; i< 5; i++) {
			for(j =1; j<= 5; j++) {
				System.out.print(i * 5 + j + " ");
			}
			System.out.println();
		}
		
	}
}
