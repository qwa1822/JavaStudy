package ch13;

public class Taxi {
	
	String name;
	int money;
	
	public Taxi(String name) {
		this.name=name;
	}
	
	
	public void takeTaxi(int money) {
		this.money+=10000;
		
	}
	
	
	public void showTaxiInfo() {
		System.out.println(name+"���� ������"+money+"�Դϴ�.");
	}

}
