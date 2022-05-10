package ch23_2차원배열;

public class TwoArrayList {

	public static void main(String[] args) {

		
		
		int[][] arr= {{1,2,3}, {1,2,3,4}};
		
		
		int i,j;
							//length는 행의길이를 나타냄.
		for(i=0; i<arr.length; i++) {   //바깥쪽 행
			for(j=0; j<arr[i].length; j++) {//i번쨰 행전체 출력 (첫번째행),(두번째행)
			System.out.print(arr[i][j]+ ",");	
			}
			//한행이 끝나면 i번쨰 출력
			
			
			System.out.println("\t"+arr[i].length);
			
		}
	}

}
