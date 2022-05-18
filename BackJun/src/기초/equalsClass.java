package 기초;

public class equalsClass {

	public static void main(String[] args) {

		
		String hi="hello";
		String hello="hell";
		
		
		
		System.out.println("hi:"+hi);
		System.out.println("hello:"+hello);
		
		
		if(hi.equals(hello)) {
			System.out.println("서로 같습니다.");
		}
		else {
			System.out.println("다릅니다.");
		}
	}

}
