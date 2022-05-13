package ch01;

public class Ex03 {
	
	public static void main(String args[]) { //i=1,2,4,8,16
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=10; i++) {
			for(int j=10; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
