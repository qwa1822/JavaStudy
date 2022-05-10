package ch17;

public class Car {
	
	
	
	
	private static int  sreialNum=10000;
	private int carNum;
	
	
	public Car() {
		sreialNum++;
		carNum=sreialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	
	public void setCarNum(int Carnum) {
		this.carNum=Carnum;
	}
	
	

}
