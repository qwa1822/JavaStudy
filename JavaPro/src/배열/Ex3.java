package 배열;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		
		//index범위 : 0~9
	int[] arr=new int[9];  //길이가 5인 int배열 arr을 생성
	
	System.out.println("arr.length="+arr.length);
	
	for(int i=0; i<=arr.length-1; i++) {    //인덱스 범위가 벗어나기떄문에
										//length-1을 입력해서 배열끝까지만 출력
		System.out.println("arr["+i+"]="+arr[i]);
	}
		
		
		
	}

}
