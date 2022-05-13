package 배열;

import java.util.Arrays;

public class 로또2 {

	public static void main(String[] args) {

	int j=0;
	int temp=0;
	
	
	int ace[]=new int[45];
	
	for(int i=0; i<ace.length; i++) {
		ace[i]=i+1;
	}
	
	for(int i=0; i<6; i++) {
		j=(int)(Math.random()*45);
		
		temp=ace[0];
		ace[0]=ace[j];
		ace[j]=temp;
	}
	
	
	for(int i=0; i<6; i++) {
		System.out.printf("ball[%d]=%d%n",i,ace[i]);
	}
	}

}
