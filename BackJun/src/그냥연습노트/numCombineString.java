package 그냥연습노트;

public class numCombineString {

	public static void main(String[] args) {

		
		String str4="Hi ! i'm";
		int age=20;
		int age2=4;
		String str5="years old.";
		
		
		//문자열과 문자열 사이에 +기호를 넣게 되면 문자열이 붙어서 출력된다.

		System.out.println(str4+age+str5);
		System.out.println(str4+age+age2+str5);	//소괄호를 사용하지 않았을 때
		System.out.println(str4+(age+age2)+str5);	  //소괄호를 사용했을 때
	}	

}
