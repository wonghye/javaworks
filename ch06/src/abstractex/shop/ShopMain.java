package abstractex.shop;

public class ShopMain {

	public static void main(String[] args) {
		
		HeadShop shop1 = new Shop1();
		shop1.sellDoenjanaJjige();
		shop1.sellKimchiJjige();
		shop1.sellBibimBap();
		System.out.println("================");
		
		HeadShop shop2 = new Shop2();
		shop2.sellDoenjanaJjige();
		shop2.sellKimchiJjige();
		shop2.sellBibimBap();
		System.out.println("================");
	}

}
