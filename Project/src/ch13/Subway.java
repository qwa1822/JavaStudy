package ch13;

public class Subway {
	int lineNumber;
	int money;
	int count;
	
	
	
	
	public Subway(int lineNumber ) {
		this.lineNumber=lineNumber;
		
		
	}
	
	
	
	public void take(int money) {
		this.money+=money;
		count++;
		
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"�� ��ȣ�� ����ö�� �°�����"+count+"�̰� ��������"+money+"�Դϴ�.");
	}

}
