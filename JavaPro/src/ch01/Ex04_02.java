package ch01;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {

		
		int num=12345, sum=0;
		
		System.out.println(2843848%10);   //10으로 나머지 연산 마지막 자리를 도출
		System.out.println(12345%10);    //마지막자리를 도출
		
		
		
		//10으로 나눈경우
		//
		//num = 12345 ,1234, 123, 12 ,1
		
		
		while(num>0) {
			
			sum+=num%10;
			System.out.println("sum"+sum+",num%10="+num);
			num=num/10;
		}
	}

}
