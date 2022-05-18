package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 나머지 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc=new Scanner(System.in);
		
		BufferedReader n1=new BufferedReader(new InputStreamReader(System.in));
		
		
		boolean n2[]=new boolean[42];
		
		for(int i=0; i<10; i++) {
			
			n2[Integer.parseInt(n1.readLine())%42]=true;
		}
		
		int count=0;
		for(boolean n13:n2) {
			if(n13) {
				count++;
			}
		}
		System.out.println(count);
		
				}

}
