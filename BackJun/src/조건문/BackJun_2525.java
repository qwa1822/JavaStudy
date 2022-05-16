package Á¶°Ç¹®;

import java.util.Scanner;

public class BackJun_2525 {

	public static void main(String[] args) {

		
	
		Scanner sc=new Scanner(System.in);
		
		int hour=sc.nextInt();
		int minute=sc.nextInt();
		int sum=sc.nextInt();
		
		
		hour+=(minute+sum)/60;
		if(hour>24) hour-=24;
		minute=(minute+sum)%60;
		System.out.println(hour+ " "+ minute);
	
	
		
		
		
	}

}
