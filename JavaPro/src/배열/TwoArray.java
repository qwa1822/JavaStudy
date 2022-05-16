package ¹è¿­;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArray {

	public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
		
		
		int i=sc.nextInt();
		int ace[] =new int[i];
		for(int a=0; a<i; a++) {
			
			int width=sc.nextInt();
			int height=sc.nextInt();
			ace[a]=width*height;
			}
		
	
	Arrays.sort(ace);
	System.out.println();
	for(int a=0; a<ace.length; a++) {
		if(a%2==1) {
			System.out.println(ace[1]);
		}
		else if(a%2==0) {
			if(ace[2]>ace[3])
				System.out.println(ace[3]);
			if(ace[3]>ace[2])
				System.out.println(ace[2]);
		}
	}
	}

}
