package 기초;

import java.util.Scanner;

public class breakClass {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
				
			int num;		//입력받는 수를 담는 변수
		int w=0;			//입력받은 음수의 갯수를 저장하는 변수				
		
		while(true) {
		System.out.println("숫자를 입력하세요!:");
		num=sc.nextInt();
		if(num<0) {
			   //입력한 수가 음수이면, 입력한 음수를 출력하고 count를 증가한다.
			System.out.println("입력하신 음수는"+num);
			w++;
		}else {
			System.out.println("양수 입력했네; 다시입력하셈");
			System.out.println("입력한 음수의ㅏ 갯수"+w);
		}
		
		if(w==5) {
			break;
		}
		
		
		
	}
		
		System.out.println("w의 값"+w);
	}
}
