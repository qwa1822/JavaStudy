package ch04;

public class VIPCustomer extends Customer {
	
	
	


	double saleRatio;
	private String agentID;
	
	
	public String getAgentID() {
		
		return agentID;
	}


	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}


	/*public VIPCustomer() {
		
		
		System.out.println("VIPCustomer() call");
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		
		

	}


	@Override
	public int calcPrice(int price) {

		bonusPoint+=price*bonusRatio;
		
		price -=(int)(price*saleRatio);
		return price;
	}
	
	
	
	
	
	
	
	
}
