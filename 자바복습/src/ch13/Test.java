package ch13;

public class Test {

	public static void main(String[] args) {

		
		
		addWard n1=new addWard("addward",20000);
		
		Taxi taxi=new Taxi("잘나간다 운수");
		
		n1.takeTaxt(taxi);
		
		n1.showInfo();
		taxi.showTaxiInfo();
	}

}
