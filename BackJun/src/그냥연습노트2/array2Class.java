package 그냥연습노트2;

public class array2Class {

	public static void main(String[] args) {

		// new int[ 노란 박스의 개수 ][ 파란 박스의 개수 ];
		// 값을 일일히 초기화하는 방법

		int doubleArr[][] = new int[3][2]; // 초록색 박스 생성

		doubleArr[0][0] = 00; // 파란 박스에 접근
		doubleArr[0][1] = 01;

		doubleArr[1][0] = 10;
		doubleArr[1][1] = 11;

		doubleArr[2][0] = 20;
		doubleArr[2][1] = 21;

		// 값을 선언과 동시에 초기화하는 방법
		int doubleArr2[][] = { // 초록색 박스

				{ 00, 01, 02 }, // 노란 박스
				{ 10, 11, 12 }, { 20, 21, 22 }, { 30, 31, 32 } };

		// doubleArr.length는 3이다.

		for (int i = 0; i < doubleArr.length; i++) {
			// doubleArr[i].length는 2이다.
			for (int j = 0; j < doubleArr[i].length; j++) {
				System.out.println(" " + doubleArr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		for(int i=0; i<doubleArr2.length; i++) {
			  //doubleArr2[i].length는 3이다.
			for(int j=0; j<doubleArr2[i].length; j++) {
				System.out.print(" "+doubleArr2[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	

}
