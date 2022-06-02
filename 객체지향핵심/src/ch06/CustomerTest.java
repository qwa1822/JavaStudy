package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		
	
		ArrayList<customer> customerList=new ArrayList<>();
		
		customer customerT=new customer(10010,"Tomas");
		customer customerJ=new customer(10020,"James");
		customer customerE=new GoldCustomer(10030,"Edwards");
		customer customerP=new GoldCustomer(10040,"Percy");
		customer customerK=new VIPCustomer(10050,"kim");
		
		
		customerList.add(customerK);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerT);
		
//		for(customer customer:customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		
//		int price=10000;
//		for(customer customer:customerList) {
//			int cost=customer.calcPrice(price);
//			System.out.println(customer.getCustomerName()+"님이"+cost+"원 지불하셨습니다.");
//			System.out.println(customer.getCustomerName()+"님의 현재 보너스포인트는"+customer.bonusPoint+"입니다.");
//		}
		
		
		if(customerE instanceof GoldCustomer) {
			GoldCustomer vc=(GoldCustomer)customerE;
			System.out.println(customerE.showCustomerInfo());
		
		
		}
		
	}

}
