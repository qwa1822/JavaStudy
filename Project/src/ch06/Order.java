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
		System.out.println("������ȣ�� "+orderNumber+"�̰�, �ڵ�����ȣ�� "+phoneNumber+"�̸�, �ּҴ�"+
	address+"�̰�, �ֹ���¥��"+date+"�̸鼭, �ֹ��ð���"+time+"�̰�, �ֹ�������"+price+"�Դϴ�.");
	}
	
}
