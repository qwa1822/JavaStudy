package ch03;

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


	public int getAgentID() {
		
		return agentID;
	}


	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	

}
