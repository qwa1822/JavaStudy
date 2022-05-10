package ch13;

public class Test {

	public static void main(String[] args) {

		
		
		Student2 Student=new Student2(20000, "Edward");
		
		
		
		Taxi taxi=new Taxi();
		taxi.name="잔라간다 운수택시";
		Student.TakeTaxi(taxi);
		
		
		Student.showInfo();
		taxi.showInfo();
		
		
		
		
		
	
		
		
		
	}

}
