package String배열;

public class ArrayString {

	public static void main(String[] args) {

		// index: 0~3-1, 0~2
		String[] strArr= {"가위","바위","보"};
		
		for(int i=0; i<10; i++) {
			
			int tmp=(int)(Math.random()*3);
			System.out.println(strArr[tmp]);
		}
		
		
		
		
		
	}

}
