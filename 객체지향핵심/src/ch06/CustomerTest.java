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
//			System.out.println(customer.getCustomerName()+"����"+cost+"�� �����ϼ̽��ϴ�.");
//			System.out.println(customer.getCustomerName()+"���� ���� ���ʽ�����Ʈ��"+customer.bonusPoint+"�Դϴ�.");
//		}
		
		
		if(customerE instanceof GoldCustomer) {
			GoldCustomer vc=(GoldCustomer)customerE;
			System.out.println(customerE.showCustomerInfo());
		
		
		}
		
	}

}
