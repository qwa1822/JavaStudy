package ch01;

public class Ex02 {

	public static void main(String[] args) {

		
		int num=0;
		
		for(int i=1 ; i<=20; i++) {
//			System.out.println(Math.random()*10);
//			System.out.println((int)(Math.random()*10)+1);  //1~10까지 출력
//			System.out.println((int)(Math.random()*11));
			System.out.println((int)(Math.random()*11)-5);  //형변환으로 소숫점 잘라주는것.
		}
	}

}
