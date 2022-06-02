package ch06;

public class VIPCustomer extends customer {
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade="VIP";
		bonusRatio=0.05;
		salesRatio=0.1;
		
		System.out.println("VIPCUstomer(int,String)");
	}


	double salesRatio;
	private int agentID;
	
	
//	public VIPCustomer() {
//		super(0,"no-name");
//		customerGrade="VIP";
//		bonusRatio=0.05;
//		salesRatio=0.1;
//	}


	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		price-=(int)(price*salesRatio);
		return price;
		
	}


	public int getAgentID() {
		
		return agentID;
	}


	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	

}
