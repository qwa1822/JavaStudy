package 반복문;

import java.util.Scanner;

public class X보다작은수 {

	public static void main(String[] args) {

		
		
		
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		
		
		int b=sc.nextInt();
		for(int a=0; a<i; a++) {
			int d=sc.nextInt();
			if(b>d) {
				System.out.print(d+" ");
			}
		}
		
	}

}
