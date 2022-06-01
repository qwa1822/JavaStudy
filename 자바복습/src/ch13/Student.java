package ch13;

public class Student {
	
	String studentName;
	int money;
	
	
	public Student(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
		
	}
		
	public void takeBus(Bus bus) {
		bus.takeBus(1000);
		this.money-=1000;
	}
	
	public void takeSub(Subway sub) {
		sub.takeBus(1200);
		this.money-=1200;
		
	}
	
	
	public void showInfo() {
		System.out.println(studentName+"는"+money+"원 남았습니다.");
	}
	}
	
	
	

