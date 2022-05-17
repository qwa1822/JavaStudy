package 그냥연습노트;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int two;
		int d;
		
		int sum=0;
		if(a==b && a==c && b==c)  {
			sum=10000+(a*1000);
			System.out.println(sum);
		}
		else if(a==b || a==c) {
			sum=1000+(a*100);
			System.out.println(sum);
		}
		else if(b==c) {
			sum=1000+(a*100);
			System.out.println(sum);
		}
		else {
			System.out.println((Math.max(a, Math.max(b, c))*100));
			
		}
		
		
	
	}

}
