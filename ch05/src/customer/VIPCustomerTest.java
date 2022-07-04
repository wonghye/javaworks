package customer;

public class VIPCustomerTest{

	public static void main(String[] args) {
		//VIP 고객 객체 생성
		VIPCustomer customerking = new VIPCustomer();
		
		customerking.setCustomerName("세종대왕");
		customerking.setAgentID(1446);
		
		//상품 구매
		int price = 10000;
		customerking.calcPrice(price );
		
		int price2 = 10000;
		customerking.calcPrice(price2);
		
		
		System.out.println(customerking.showCustomerInfo());
	}

}
