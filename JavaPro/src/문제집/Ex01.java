package ¹®Á¦Áý;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		int tmp=0;
		for(int i=0; i<n; i++) {
			int w=sc.nextInt();
			int h=sc.nextInt();
			arr[i]=w*h;
		}
		
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
		}
		
		int mid = (n-1)/2;
		System.out.println(mid);
		System.out.println(arr[mid]);
		
		
		
		
		
		
		
		
				}
	
}
