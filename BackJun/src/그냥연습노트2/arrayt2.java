package �׳ɿ�����Ʈ2;

import java.util.Scanner;

public class arrayt2 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("�л� ����ΰ���?");
		int student=sc.nextInt();
		
		int ace2[][]=new int[student][3];
		
		int persontotal=0;
		int personaverage=0;
		
		int sum=0;
		int average=0;
		
		
		for(int i=0; i<ace2.length; i++) {
			System.out.println(i+1+"��° �л�");
			for(int j=0; j<ace2[i].length; j++) {
				
				System.out.println("\t"+(j+1)+"���� ���� ������ �Է��ϼ���");
				
				ace2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<ace2.length; i++) {
			for(int j=0; j<ace2[i].length; j++) {
				sum+=ace2[i][j];
			}
		}
		
		average=(sum/ace2.length);
		
		
		System.out.println("������"+sum);
		System.out.println("�����"+average);
		
		
		for(int i=0; i<ace2.length; i++) {
			persontotal=0;
			
			for(int j=0; j<ace2[i].length; j++) {
				
				persontotal+=ace2[i][j];
				
				
				
				
				
			}
			personaverage=(persontotal/ace2[i].length+persontotal%ace2[i].length);
			
			System.out.println((i+1)+"���� �����л��� ����������"+persontotal+"\t�������:"+personaverage);
		}
	}

}
