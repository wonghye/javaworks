package override;

public class Shop2 extends HeadShop {
	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}
	
	//메서드 재정의 - 부모 클래스와 내용이나 기능이 다를때 재정의 
	//애너테이션 - '@' 컴파일러에게 신호를 보냄
	@Override
	public void sellDoenjanaJJige() {
		System.out.println("된장찌게 : 7,000");
	}
	@Override
	public void sellKimchiJJige() {
		System.out.println("김치찌게 : 7,500");
	}
	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥 : 7,500");
	}
}
