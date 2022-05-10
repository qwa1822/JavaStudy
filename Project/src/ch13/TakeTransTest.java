package ch13;

public class TakeTransTest {

	public static void main(String[] args) {

		
		
		Student studentJ=new Student("James",5000);
		
		Student StudentT=new Student("Tomas",10000);
		
		
		Bus bus100=new Bus(100);
		Bus bus500=new Bus(500);
		studentJ.takeBus(bus100);
		
		Subway subway=new Subway(2);
		
		StudentT.takeSubway(subway);
		
		
		
		studentJ.showInfo();
		StudentT.showInfo();
		
		bus100.showBusinfo();
		subway.showInfo();
		
		bus500.showBusinfo(); 
	}

}
