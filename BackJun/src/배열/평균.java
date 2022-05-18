package ¹è¿­;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class Æò±Õ {

	public static void main(String[] args) throws IOException {

		
		
	 Scanner sc=new Scanner(System.in);
	 
	 
	 double ace[]=new double[sc.nextInt()];	
	
	
	for(int i=0; i<ace.length; i++) {
		ace[i]=sc.nextDouble();
	}
	
	double sum=0;
	Arrays.sort(ace);
	
	for(int i=0; i<ace.length; i++) {
		sum += ((ace[i] / ace[ace.length-1]) * 100);
		
	}
	
	System.out.println(sum/ace.length);
	
	}

}
