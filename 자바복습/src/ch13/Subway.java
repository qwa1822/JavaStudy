package ch13;

public class Subway {
	
	
	int SubNumber;
	int money;
	int passengerCount;
	
	
	public Subway(int SubNumber) {
	
		
		this.SubNumber=SubNumber;
	}
	
	
	public void takeBus(int money) {
		this.money+=1200;
		passengerCount++;
	}
	
	
	
	public void showBusInfo() {
		System.out.println(SubNumber+"번의 승객수는"+passengerCount+"이고,"
				+"수입은 "+money+"입니다.");
	}
}
