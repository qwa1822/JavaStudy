package ch02;

import java.util.Scanner;

public class Ex04_20 {

	public static void main(String[] args) {

		
		int i=0, num=0;
		Scanner sc=new Scanner(System.in);
		
		
		outer:         //while문에 outer라는 이름을 붙였다..
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요");
			
			String tmp=sc.nextLine();  //화면에서 입력받은 내용을 tmp에 저장
			 i=Integer.parseInt(tmp);	//입력받은 문자열(tmp)을 숫자로 변환.
			
			 
			 if(i==0) {
				 System.out.println("종료합니다...");
				 break;
			 }
			 else if(!(i>1 && i<=3)) {
				 System.out.println("메뉴를 잘못선택하셨습니다... 1~3사이를 입력해주세요");
				 continue;
			 }
			
		
			 for(;;) {  //무한 반복문 
				 System.out.println("게산할 값을 입력하세요(계산종료:0, 전체종료:99)>");
				 tmp=sc.nextLine();   //화면에서 입력받은 내용을 tmp에 저장
				 num=Integer.parseInt(tmp);	//입력받은 문자열(tmp)을 숫자로변환
				 
				 if(num==0)
					 break;   //계산종료 . for문을 벗어난다.
				 
				 if(num==99)
					 break outer;	//전체종료. for문과 while문을 벗어난다.
				 
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
			 
			
			
		}// while 의 끝
		
		System.out.println("프로그래밍 종료");
		
		
	
	}

}
