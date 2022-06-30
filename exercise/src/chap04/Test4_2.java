package chap04;

public class Test4_2 {

	public static void main(String[] args) {
		//1  for , while, do-while
		
		//2
		int sum = 0;
		for(int i = 1; i <=100; i++) {
			if(i % 3 ==0) {
			sum += i;
			}
			
		}
		System.out.println("3의 배수 합 : " + sum);
		
		
		//3
		while(true) {
			int dice1 = (int)(Math.random() * 6)+1;
			int dice2 = (int)(Math.random() * 6)+1;
			System.out.println("(" + dice1 + " , " + dice2+")");
			if((dice1 + dice2) == 5) {
				break;
			}
		}
		
		System.out.println(" ");
		
		//4
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y<=10 ; y++) {
				if( (4 * x + 5 * y) == 60) {
					System.out.println("(" + x + " , " + y +")");
				}
			}
		}
		
		
		//5
		int i,j;
		for(i = 1; i < 5; i++) {
			for(j = 1; j <=i; j++) {
				System.out.println("*");
				if(j ==i) {
					System.out.println();
				}
			}
		}
		
		
		//6
		for(int ii = 1; ii < 5; ii++) {
			for(int jj = 4; jj<=i; jj--) {
				if(ii < jj) {
					System.out.println(" ");
				}else {
				System.out.println("*");
			}	
		}
		System.out.println();
	}

	}
}
