package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		
		ArrayList<Customer> customerList=new ArrayList<>();
		
		Customer customerT=new Customer(10010,"Tomas");
		Customer customerF=new Customer(10020,"Minsu");
		Customer customerC=new GoldCustomer(10030,"which");
		Customer customerP=new GoldCustomer(10040,"Percy");
		Customer customerQ=new VIPCustomer(10050,"bongjae");
		
		
		customerList.add(customerT);
		customerList.add(customerF);
		customerList.add(customerC);
		customerList.add(customerP);
		customerList.add(customerQ);
		
//		
//		for(Customer customer:customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		
//		int price=10000;
//		for(Customer customer:customerList) {
//			
//			
//			int cost=customer.calcPrice(price);
//			System.out.println(customer.getCustomerName()+"����"+cost+"��ŭ �����ϼ̽��ϴ�");
//			System.out.println(customer.getCustomerName()+"���� ���� ���ʽ�����Ʈ�� "+customer.bonusPoint+"�Դϴ�");
//		}
		
		if(customerF instanceof GoldCustomer) {
		VIPCustomer vc=(VIPCustomer)customerF;
		System.out.println(customerF.showCustomerInfo());
		}
	}

}
