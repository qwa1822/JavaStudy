package 기초;

public class indexOfClass {

	public static void main(String[] args) {

//		indexOf() 함수는 String 에서 특정 문자가 위치하는 주소를 반환한다.
		//문자열에서 해당 문자가 있는 위치를 반환한다.
		//하지만 문자를 발견하지 못하면 -1을 출력한다. 공백도 문자로 치기 때문에 W의 위치는 6이 나온다.


		String hello="Hello World!";
		System.out.println(hello.indexOf('e'));
		System.out.println(hello.indexOf('W'));
		System.out.println(hello.indexOf('E'));
	}

}
