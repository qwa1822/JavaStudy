package ch13;

public class Bus {
	int busNumber;
	int money;
	int passengerCount;
	
	
	public Bus(int busNumber) {
	
		
		this.busNumber=busNumber;
	}
	
	
	public void takeBus(int money) {
		this.money+=1200;
		passengerCount++;
	}
	
	
	
	public void showBusInfo() {
		System.out.println(busNumber+"���� �°�����"+passengerCount+"�̰�,"
				+"������ "+money+"�Դϴ�.");
	}
	}

