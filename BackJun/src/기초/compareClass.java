package 기초;

public class compareClass {

	public static void main(String[] args) {

		
		String hi="hello";
		String hello="hell";
		
		
		hello=hello+"o";
		
		System.out.println("hi:"+hi);
		System.out.println("hello:"+hello);
		
		
		if(hi==hello) {
			System.out.println("두 문자열은 같습니다.");
		}else {
			System.out.println("두 문자열은 다릅니다.");
		}
	}

}
