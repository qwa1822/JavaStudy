package �׳ɿ�����Ʈ;

import java.util.Scanner;

public class ex022 {

	public static void main(String[] args) {

		
		int count=0;
		
	Scanner sc=new Scanner(System.in);
		
		while(true) {
		
			System.out.println("���ڸ� �Է��ϼ���");
			int n=sc.nextInt();
			
			if(n>0) {
				System.out.println("�Է��� ����"+n+"�Դϴ�");
				count++;
			}else {
				System.out.println("�Է��� ���� "+n+"�����Դϴ�");
				count--;
			}
			
		}
	}

}
