package ch20;

public class ArrayList {

	public static void main(String[] args) {

		
		int [] arr=new int[10];
		int total=0;
		
		
		for(int i=0, num=1; i<arr.length; i++) {
			arr[i]=num++;			//num을 통해 배열1,2,3,4,5를 집어넣어줌.
		}
		
	
		for(int num:arr) {
			total+=num;
		}
		
		System.out.println(total);
		
	}

}
