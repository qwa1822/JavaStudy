package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void stratCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void tunrOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}   //구현부가 있지만 구현내용이 없는것이다.
	
	
	final public void run() {
		stratCar();
		drive();
		wiper();
		stop();
		washCar();
		tunrOff();
	}
}
