package 그냥연습노트;

import java.util.Scanner;

public class ex022 {

	public static void main(String[] args) {

		
		int count=0;
		
	Scanner sc=new Scanner(System.in);
		
		while(true) {
		
			System.out.println("숫자를 입력하세요");
			int n=sc.nextInt();
			
			if(n>0) {
				System.out.println("입력한 수는"+n+"입니다");
				count++;
			}else {
				System.out.println("입력한 수는 "+n+"음수입니다");
				count--;
			}
			
		}
	}

}
