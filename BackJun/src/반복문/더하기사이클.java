package �ݺ���;

import java.util.Scanner;

public class ���ϱ����Ŭ {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int copy=N;
		int count=0;
		
		while(true) {
			int q=copy/10;
			int r=copy%10;
			
			
			int sum=q+r;
			
			copy=r*10+sum%10;
			
			count++;
			
			if(copy==N) {
				break;
		
			}
			
		}
		System.out.println(count);
		sc.close();
		
	}

}
