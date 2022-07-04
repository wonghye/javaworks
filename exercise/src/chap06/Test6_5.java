package chap06;

public class Test6_5 {

	public static void main(String[] args) {
		//3
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {  // 객체의 주소 비교
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}

	}

}
