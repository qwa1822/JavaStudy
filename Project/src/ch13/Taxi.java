package ch13;

public class Taxi {
	
	
	
	int money;
	public String name;
	int count;
	
	Taxi(){
		
	}
	
	
	Taxi(int money,String name){
		this.money=money;
		this.name=name;
	}
	
	public void Take(int money) {
		this.money+=money;
		count++;
		
	}
	
	
	public void showInfo() {
		System.out.println(name+"������ "+money+"�Դϴ�.");
	}

}
