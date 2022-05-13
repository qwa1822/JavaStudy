package ch02;

import java.util.Scanner;

public class Ex04_18 {

	public static void main(String[] args) {

		int menu=0;
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) squre root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)");
			
			String tmp=sc.nextLine();  		//스트링타입
			menu=Integer.parseInt(tmp);     //정수로변환
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else if(!(1<=menu && menu<=3)) {  //1~3사이를 입력안했을때
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는0)");
				continue;
			}
			
			System.out.println("선택하신 메뉴는"+menu+"변 입니다.");
		}
	}

}
