package �ݺ���;

import java.util.Scanner;

public class �����_2 {

	public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
		
		
		int a=sc.nextInt();
		
		
		
		for(int i=1; i<=a; i++) {
			for(int k=a; k>i; k--) {
			System.out.print(" ");	
			}
			for(int b=1; b<=i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
