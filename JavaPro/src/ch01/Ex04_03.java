package ch01;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
	 int input=0, answer=0;
	 
	 answer=(int)(Math.random()*100)+1;
	 System.out.println("1�� 100������ ������ �Է��ϼ���");
	 
	 while(input!=answer) {
		
		 input=sc.nextInt();
		 if(input>answer) {
			 System.out.println("�� �������� �Է��غ�����");
		 }else if(answer>input) {
			 System.out.println("�� ū���� �Է��غ�����!");
		 }
		 
		
	 }
	 System.out.println("�����Դϴ�.");
		
		
	}

}
