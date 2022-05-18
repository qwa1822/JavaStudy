package 그냥연습노트2;

import java.util.Scanner;

public class array2활용 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("학생은 총 몇명입니까?");
		int student=sc.nextInt();
		int personaisum=0;  
		int personaiavg=0;
		
		int sum=0;
		int avg=0;
		
		int score[][]=new int[student][3];//학생 수는 입력받고, 과목은 3개로 정해져 있다.
		
		
	    //score.length는 입력받은 학생 수 만큼의 길이를 갖는다.
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"번쨰 학생");
			
			 //score[i].length는 과목의 수만큼의 길이를 같는다. == 3
			for(int j=0; j<score[i].length; j++) {
				System.out.println("\t"+(j+1)+"번쨰 과목을 입력하세요");
				//score[i][j]는 i번째 학생의 j번째 점수라는 의미를 갖는다.(i와 j는 0부터 시작.)
				score[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++) {
				sum+=score[i][j];
			}
		}
		
		for(int i=0; i<score.length; i++) {
			personaisum=0;			//학생 1명의 총점을 구하고 다음 학생의 총점을 구하기 전에 0으로 변수를 초기화한다.
				//초기화를 하지 않으면 점수가 전부 더해져 전체 학급 총점이 된다
		for(int j=0; j<score[i].length; j++) {
			personaisum+=score[i][j];
		}
		
		personaiavg=(personaisum/score[i].length+personaisum%score[i].length);
		System.out.println((i+1)+"번쨰 학생의 개인총점"+personaisum+"\t개인평균"+personaiavg);
		}
	}

}
