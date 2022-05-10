package ch06;

public class Order {

	
	
	public int orderNumber;
	public int phoneNumber;
	public String address;
	public int date;
	public int time;
	public int price;
	public int menuNumber;
	
	
	Order(){}
	
	
	public Order( int orderNumber,int phoneNumber,String address,
			 int date,int time,int price,int menuNumber)
	{
		this.orderNumber=orderNumber;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.date=date;
		this.time=time;
		this.price=price;
		this.menuNumber=menuNumber;
		
	}
	
	
	public void showInfo() {
		System.out.println("접수번호는 "+orderNumber+"이고, 핸드폰번호는 "+phoneNumber+"이며, 주소는"+
	address+"이고, 주문날짜는"+date+"이면서, 주문시각은"+time+"이고, 주문가격은"+price+"입니다.");
	}
	
}
