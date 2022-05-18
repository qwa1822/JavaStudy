package 그냥연습노트;

import java.util.Arrays;
import java.util.Scanner;

public class 로또 {

	public static void main(String[] args) {

		
		int arr[]=new int[6];
		
		
		arr[0]=(int)(Math.random()*44+1);
		arr[1]=(int)(Math.random()*44+1);
		
		arr[2]=(int)(Math.random()*44+1);
		arr[3]=(int)(Math.random()*44+1);
		arr[4]=(int)(Math.random()*44+1);
		arr[5]=(int)(Math.random()*44+1);
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
