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
		System.out.println(lineNumber+"ÀÇ ¹øÈ£ÀÇ ÁöÇÏÃ¶ÀÇ ½Â°´¼ö´Â"+count+"ÀÌ°í ¹úÀºµ·Àº"+money+"ÀÔ´Ï´Ù.");
	}

}
