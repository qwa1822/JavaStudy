package 그냥연습노트2;

public class bubblesort {

	public static void main(String[] args) {

		
		
		int number[]=
			{1,3,4,65,46,46,84,51,23,4,84,
			84,6541,32,15,34,894,9843,121312,
			32,6995,41
			};
		
		
		
	
		int temp;
		for(int i=0; i<number.length-1; i++) {
			for(int j=i+1; j<number.length; j++) {
				if(number[i]>number[j]) {
				temp=number[i];
				number[i]=number[j];
				number[j]=temp;
				}
			}
		}
		
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}

}
