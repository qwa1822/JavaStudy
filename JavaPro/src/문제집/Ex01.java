package ¹®Á¦Áý;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		int tmp=0;
		
		for(int j=0; j<n; j++) {
			int w=sc.nextInt();
			int h=sc.nextInt();
			
			arr[j]=w*h;
			
		}
		
		
		for(int j=0; j<n-1; j++) {
			for(int c=j+1; c<n; c++) {
				if(arr[j]>arr[c])
					tmp=arr[j];
					arr[j]=arr[c];
					arr[c]=tmp;
					
				
			}
		}
		
		int mid=(n-1)/2;
		System.out.println(arr[mid]);
		
		
		
		
		
		
		
				}
	
}
