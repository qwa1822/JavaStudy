package ch06;

public class Order {
	public int orderNumber;
	public int PhoneNumber;
	public String address;
	public int orderDate;
	public int orderTime;
	public int price;
	public int menuNumber;

	public Order(int orderNumber, int PhoneNumber, String address) {
		this.orderNumber = orderNumber;
		this.PhoneNumber = PhoneNumber;
		this.address = address;
	}

	public Order() {
	}

	public String showInfO() {
		return "������ȣ��"+orderNumber+"�̰�,"+"�޴��� ��ȣ��"+PhoneNumber+"�̸�,"+
	"�ּҴ�"+address+"�̰�, �ֹ���¥��"+orderDate+"�̸�,"+"�ֹ��ð��� "+orderTime+"�̸�,"+
				"�ֹ� ������"+price+"�Դϴ�."+"�޴���ȣ��"+menuNumber+"�Դϴ�.";
	}
}
