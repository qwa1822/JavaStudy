package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		
		
		customer customerLee=new customer(10010,"이순신");
	
		customerLee.bonusPoint=1000;
		
		int price=customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo()+price);
	
		VIPCustomer customerKim=new VIPCustomer(10020,"김유신");
		price=customerKim.calcPrice(1000);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo()+price);
		
			customer vc=new VIPCustomer(12345,"noname");
		System.out.println(vc.calcPrice(1000));
	}

}
