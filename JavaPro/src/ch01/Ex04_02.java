package ch01;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {

		
		int num=12345, sum=0;
		
		System.out.println(2843848%10);   //10���� ������ ���� ������ �ڸ��� ����
		System.out.println(12345%10);    //�������ڸ��� ����
		
		
		
		//10���� �������
		//
		//num = 12345 ,1234, 123, 12 ,1
		
		
		while(num>0) {
			
			sum+=num%10;
			System.out.println("sum"+sum+",num%10="+num);
			num=num/10;
		}
	}

}
