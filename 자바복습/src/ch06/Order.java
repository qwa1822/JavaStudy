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
		return "접수번호는"+orderNumber+"이고,"+"휴대폰 번호는"+PhoneNumber+"이며,"+
	"주소는"+address+"이고, 주문날짜는"+orderDate+"이며,"+"주문시간은 "+orderTime+"이며,"+
				"주문 가격은"+price+"입니다."+"메뉴번호는"+menuNumber+"입니다.";
	}
}
