package ch13;

public class Student2 {

	public int money;
	public String name;
	
	
	public Student2(int money,String name) {
		this.money=money;
		this.name=name;
	}
	
	
	public void TakeTaxi(Taxi taxi)
	{
		taxi.Take(10000);
		this.money-=10000;
	}
	
	
	public void showInfo() {
		System.out.println(name+"¥‘¿« ≥≤¿∫ µ∑¿∫"+money+"¿‘¥œ¥Ÿ.");
	}
}
