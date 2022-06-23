package nestedfor;

public class ForEx {

	public static void main(String[] args) {
		// 중첩된 for문 - 행, 열
		int i, j;
		for(i = 1; i <=5; i++) {
			for(j = 1; j <i+1; j++) {
				System.out.print("$");
			}
			System.out.println(); //행바꿈
		}
		/*
		i = 1, j =1 $
		       j =2 $$
		       j =3 $$$
		       j =4 $$$$
		       j =5 $$$$$
		i = 2, j =1 $
		       j =2 $$
		       j =3 $$$
		       j =4 $$$$
		       j =5 $$$$$
	 	.....
	 	$$$$$
	 	*/
		for(i = 1; i <=5; i++) {
			for(j = 1; j <=i+1; j++) {
				System.out.print("가");
			}
			System.out.println(); //행바꿈
		}

	}

}
