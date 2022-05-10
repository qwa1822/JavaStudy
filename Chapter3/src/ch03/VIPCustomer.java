package ch03;

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
		
		System.out.println("VIPCustomer(int,string) call");
	}
	
	
	
	
	
	
}
