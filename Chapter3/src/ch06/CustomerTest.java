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
		
		
		for(Customer customer:customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		
		
		
	}

}
