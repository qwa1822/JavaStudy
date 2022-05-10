package ch17;

public class CarTest {

	public static void main(String[] args) {
		
		
		CarFactory factory=CarFactory.getInstace();
		Car mySonata=factory.createCar();
		Car yourSonanta=factory.createCar();
		
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonanta.getCarNum());
	}
	
	
	

}
