package 그냥연습노트2;

import java.util.Scanner;

public class arrayt2 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 몇명인가요?");
		int student=sc.nextInt();
		
		int ace2[][]=new int[student][3];
		
		int persontotal=0;
		int personaverage=0;
		
		int sum=0;
		int average=0;
		
		
		for(int i=0; i<ace2.length; i++) {
			System.out.println(i+1+"번째 학생");
			for(int j=0; j<ace2[i].length; j++) {
				
				System.out.println("\t"+(j+1)+"번쨰 과목 점수를 입력하세요");
				
				ace2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<ace2.length; i++) {
			for(int j=0; j<ace2[i].length; j++) {
				sum+=ace2[i][j];
			}
		}
		
		average=(sum/ace2.length);
		
		
		System.out.println("총점은"+sum);
		System.out.println("평균은"+average);
		
		
		for(int i=0; i<ace2.length; i++) {
			persontotal=0;
			
			for(int j=0; j<ace2[i].length; j++) {
				
				persontotal+=ace2[i][j];
				
				
				
				
				
			}
			personaverage=(persontotal/ace2[i].length+persontotal%ace2[i].length);
			
			System.out.println((i+1)+"번쨰 개인학생의 개인총점은"+persontotal+"\t개인평균:"+personaverage);
		}
	}

}
