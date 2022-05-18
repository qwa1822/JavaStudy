package 그냥연습노트;

import java.util.Arrays;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	

		
		String[]arr=new String[] {"1","2","3"};
		String stringTOsearch="2";
		
		
		//asList() 메소드는 Arrays 클래스의 정적 메소드입니다. 
		//매개변수에서 가져온 지정된 배열의 고정 목록을 반환합니다.
		System.out.println(Arrays.asList(arr).contains(stringTOsearch));
		}
	
//	
//		//contains()는 List 인터페이스의 메소드입니다. 
//	요소를 매개변수로 사용하고 이 인수를 목록에 있는 요소와 비교합니다. 
//	지정된 요소가 목록에 있으면 부울 값 true를 반환하고 두 경우 모두 false를 반환합니다. 
//	메소드는 지정된 요소의 유형이 이 목록과 호환되지 않으면 ClassCastException을 던지고, 
//	지정된 값이 null이고 이 목록이 null 값을 허용하지 않는 경우 NullPointerException을
//	throw합니다.
	
		
	}

	
	
	

