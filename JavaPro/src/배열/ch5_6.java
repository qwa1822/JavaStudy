package 배열;

import java.util.Arrays;

public class ch5_6 {
	
	
	public static void main(String [] args) {
		
	
		
		int[] iArr= {100,95,80,70,60};
		
		//배열을 가리키는 참조변수 iArr의 값을 출력한다.
		System.out.println(iArr);
		
		for(int i=0; i<iArr.length; i++) {  //배열의 요소를 하나씩 출력
			System.out.println(iArr[i]);
		}
		
		
		//배열 iArr의 모든요소를 출력한다 [100,95,80,60,60]이 출력된다
		//문자열로 바꿔주는 것.
		System.out.println(Arrays.toString(iArr));
	}

}
