package ����;

import java.util.Scanner;

public class breakClass {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
				
			int num;		//�Է¹޴� ���� ��� ����
		int w=0;			//�Է¹��� ������ ������ �����ϴ� ����				
		
		while(true) {
		System.out.println("���ڸ� �Է��ϼ���!:");
		num=sc.nextInt();
		if(num<0) {
			   //�Է��� ���� �����̸�, �Է��� ������ ����ϰ� count�� �����Ѵ�.
			System.out.println("�Է��Ͻ� ������"+num);
			w++;
		}else {
			System.out.println("��� �Է��߳�; �ٽ��Է��ϼ�");
			System.out.println("�Է��� �����Ǥ� ����"+w);
		}
		
		if(w==5) {
			break;
		}
		
		
		
	}
		
		System.out.println("w�� ��"+w);
	}
}
