package �׳ɿ�����Ʈ2;

import java.util.Scanner;

public class array2Ȱ�� {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("�л��� �� ����Դϱ�?");
		int student=sc.nextInt();
		int personaisum=0;  
		int personaiavg=0;
		
		int sum=0;
		int avg=0;
		
		int score[][]=new int[student][3];//�л� ���� �Է¹ް�, ������ 3���� ������ �ִ�.
		
		
	    //score.length�� �Է¹��� �л� �� ��ŭ�� ���̸� ���´�.
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"���� �л�");
			
			 //score[i].length�� ������ ����ŭ�� ���̸� ���´�. == 3
			for(int j=0; j<score[i].length; j++) {
				System.out.println("\t"+(j+1)+"���� ������ �Է��ϼ���");
				//score[i][j]�� i��° �л��� j��° ������� �ǹ̸� ���´�.(i�� j�� 0���� ����.)
				score[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++) {
				sum+=score[i][j];
			}
		}
		
		for(int i=0; i<score.length; i++) {
			personaisum=0;			//�л� 1���� ������ ���ϰ� ���� �л��� ������ ���ϱ� ���� 0���� ������ �ʱ�ȭ�Ѵ�.
				//�ʱ�ȭ�� ���� ������ ������ ���� ������ ��ü �б� ������ �ȴ�
		for(int j=0; j<score[i].length; j++) {
			personaisum+=score[i][j];
		}
		
		personaiavg=(personaisum/score[i].length+personaisum%score[i].length);
		System.out.println((i+1)+"���� �л��� ��������"+personaisum+"\t�������"+personaiavg);
		}
	}

}
