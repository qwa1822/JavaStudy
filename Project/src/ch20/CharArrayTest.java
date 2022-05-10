package ch20;

public class CharArrayTest {

	public static void main(String[] args) {
		
		
		
		char[]alphbets=new char[26];
		char ch='A';    //65부터 시작 아스키코드
		
		for(int i=0; i<alphbets.length; i++) {
			alphbets[i]=ch++;      //ch를 하나씩 증가 65~90
		}
		
		for(char alpha:alphbets) {
			System.out.println(alpha+" ,"+ (int)alpha);
		}
	}
	

}
