package ch02;

public class VIPCustomer extends Customer {
	
	
	double saleRatio;
	private String agentID;
	
	
	public String getAgentID() {
		return agentID;
	}


	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}


	public VIPCustomer() {
		
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	
}
