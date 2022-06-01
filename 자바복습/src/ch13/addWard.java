package ch13;

public class addWard {
	String name;
	int money;
	
	
	public addWard(String name,int money) {
		this.name=name;
		this.money=money;
		
	}
	
	public void takeTaxt(Taxi taxi) {
		taxi.takeTaxi(10000);
		this.money-=10000;
	}
	
	
	public void showInfo() {
		System.out.println(name+"¥‘¿« ≥≤¿∫µ∑¿∫"+money+"¿‘¥œ¥Ÿ.");
	}
}
