package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void stratCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void tunrOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {}   //�����ΰ� ������ ���������� ���°��̴�.
	
	
	final public void run() {
		stratCar();
		drive();
		wiper();
		stop();
		washCar();
		tunrOff();
	}
}
