package ch19;

public class Car {

	
	private static int seraalNum=10000;
	private int carNum;
	
	
	public Car() {
		seraalNum++;
		carNum=seraalNum;
	}
	
	
	public int getCarNum() {
		return carNum;
	}
	
	
	
	
	public void getCarNum(int carNum) {
		this.carNum=carNum;
	}
}
