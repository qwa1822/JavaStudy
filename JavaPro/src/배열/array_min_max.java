package 배열;

public class array_min_max {

	public static void main(String[] args) {

		
		int[] score= {79,88,91,33,100,55,95};
		
		 
		int max=score[0];   //첫번째 값으로 최대값을 초기화한다.
		int min=score[0];	//첫번째 값으로 최소값을 초기화한다.
		
		
		
		for(int i=1; i<score.length; i++) {   //88부터시작
			if(score[i]>max) {
				max=score[i];
			}
			else if(score[i]<min) {
				min=score[i];
			}
		}
		
		System.out.println("최대값: "+max);
		System.out.println("최소값"+min);
	}

}
