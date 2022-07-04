package customer;

public class VIPCustomer extends Customer {
	//필드
	private int agentID;  // 상담원 ID
	private double saleRatio; // 구매 할인율
	
	//생성자
	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05; // 5%
		saleRatio = 0.1;  // 10%
	}
	
	//매개변수 가진 생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05; // 5%
		saleRatio = 0.1;  // 10%
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	public int getAgentID() {
		return agentID;
	}
	
	//가격 계산 재정의
	@Override
	public int calcPrice(int price) {
		// 가격 = 가격 - (가격 x 구매할인율)
		price -= price - (price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	//고객 정보 재정의
	public String showCuStomerInfo() {
		return super.showCustomerInfo() + "\n담당 상담원 아이디는"
				+ agentID + "입니다.";
	}
	
}
