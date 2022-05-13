package ch01;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
	 int input=0, answer=0;
	 
	 answer=(int)(Math.random()*100)+1;
	 System.out.println("1과 100사이의 정수를 입력하세요");
	 
	 while(input!=answer) {
		
		 input=sc.nextInt();
		 if(input>answer) {
			 System.out.println("더 작은수로 입력해보세요");
		 }else if(answer>input) {
			 System.out.println("더 큰수로 입력해보세요!");
		 }
		 
		
	 }
	 System.out.println("정답입니다.");
		
		
	}

}
