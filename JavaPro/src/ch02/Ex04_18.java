package ch02;

import java.util.Scanner;

public class Ex04_18 {

	public static void main(String[] args) {

		int menu=0;
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) squre root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)");
			
			String tmp=sc.nextLine();  		//��Ʈ��Ÿ��
			menu=Integer.parseInt(tmp);     //�����κ�ȯ
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else if(!(1<=menu && menu<=3)) {  //1~3���̸� �Է¾�������
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. (�����0)");
				continue;
			}
			
			System.out.println("�����Ͻ� �޴���"+menu+"�� �Դϴ�.");
		}
	}

}
