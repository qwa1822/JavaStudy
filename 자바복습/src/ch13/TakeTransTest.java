package ch13;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentKim = new Student("James", 5000);
		Student studentlee = new Student("Tomas", 10000);

		Bus bus = new Bus(100);
		Subway sub = new Subway(120);

		studentKim.takeBus(bus);
		studentlee.takeSub(sub);

		studentKim.showInfo();

		studentlee.showInfo();

		bus.showBusInfo();
		sub.showBusInfo();

	}

}
