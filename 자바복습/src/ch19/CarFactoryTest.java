package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {

		
		
		CarFactory factory=CarFactory.getInstance();
		Car mysonata=factory.createCar();
		Car yourSonata=factory.createCar();
		
	}

}
