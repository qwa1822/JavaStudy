package ch02;

import java.util.Scanner;

public class Ex04_20 {

	public static void main(String[] args) {

		
		int i=0, num=0;
		Scanner sc=new Scanner(System.in);
		
		
		outer:         //while���� outer��� �̸��� �ٿ���..
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���");
			
			String tmp=sc.nextLine();  //ȭ�鿡�� �Է¹��� ������ tmp�� ����
			 i=Integer.parseInt(tmp);	//�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ.
			
			 
			 if(i==0) {
				 System.out.println("�����մϴ�...");
				 break;
			 }
			 else if(!(i>1 && i<=3)) {
				 System.out.println("�޴��� �߸������ϼ̽��ϴ�... 1~3���̸� �Է����ּ���");
				 continue;
			 }
			
		
			 for(;;) {  //���� �ݺ��� 
				 System.out.println("�Ի��� ���� �Է��ϼ���(�������:0, ��ü����:99)>");
				 tmp=sc.nextLine();   //ȭ�鿡�� �Է¹��� ������ tmp�� ����
				 num=Integer.parseInt(tmp);	//�Է¹��� ���ڿ�(tmp)�� ���ڷκ�ȯ
				 
				 if(num==0)
					 break;   //������� . for���� �����.
				 
				 if(num==99)
					 break outer;	//��ü����. for���� while���� �����.
				 
				 switch(i) {
				 case 1:
					 System.out.println("result="+num*num);
					 break;
				 case 2:
					 System.out.println("result="+Math.sqrt(num));
					 break;
				 case 3:
					 System.out.println("result="+Math.log(num));
					 break;
					 
				 }
				 
			 }
			 
			
			
		}// while �� ��
		
		System.out.println("���α׷��� ����");
		
		
	
	}

}
