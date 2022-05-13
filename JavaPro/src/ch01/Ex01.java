package ch01;

public class Ex01 {
	
	public static void  main(String args[]) {
	double pi=3.141592;
	double shortPI=Math.round(pi*1000)/1000.0;    //n의제곱수
	System.out.println(shortPI);
	
	//실수가 정수로바뀌면 값이 날라감
	System.out.println((int)(pi*1000)/1000.0);    //3.141 출력
	
	}
}
