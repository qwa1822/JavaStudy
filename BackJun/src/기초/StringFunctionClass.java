package 기초;

public class StringFunctionClass {

	public static void main(String[] args) {
		
//replace()
		//첫번쨰 인자는 대상 문자열, 두번쨰인자는 바꾸려는 문자열
		
		String str="A*B*C*D*E*F*G*H";
		String temp=str.replace("*", "-");
		System.out.println("replace\t"+temp);

		
		   //split() tokken 을 사용해서 문자열을 자르고 char[]로 반환된다.
	      //tokken은 구별이 가는 특정 문자이다. (*,&,^,% ... 등등)
		String str2="hello world this is java, and hello world!";
		String charArr[]=str2.split(" ");
		for(int k=0; k<charArr.length; k++) {
			System.out.println("Split\t:"+charArr[k]);
		}
		
		

	      //substring() -> 범위내 문자를 잘라서 가져옴 (시작 위치, 종료 위치 전)
		String str3="Hello world!!!";
		String tempstr=str3.substring(2,5);
		System.out.println("substring\t:"+tempstr);
		

	      //toString() 특정 자료형을 문자로 변환한다. (Wrapper Class에서 주로 사용된다.)
	      String str4 = "안녕하세요, 반가워요";
	      System.out.println("toString():\t"+str4.toString());

	      //trim() 문자열 앞과 뒤의 공백을 없애준다. (앞과 뒤만 없애줌)
	      String str5 ="         Hello          World        !!!           ";
	      System.out.println("trim()\t: "+str5+"(before)");
	      String trimStr = str5.trim();
	      System.out.println("trim()\t: "+trimStr+"(after)");

	      //valueOf() 특정 타입의 값을 문자열로 변환해준다.

	      int num= 123;
	      long lo = 1241323412L;
	      double dou = 123.45678;
	      //아래 모든 출력은 연산을 하는 것이 아니라 문자열의 합을 실행한다.
	      String iStr = String.valueOf(num);
	      System.out.println("valueOf()\t:"+iStr + 1000000);
	      String lStr = String.valueOf(lo);
	      System.out.println("valueOf()\t:"+lStr + 1000000);
	      String dStr = String.valueOf(dou);
	      System.out.println("valueOf()\t:"+dStr + 1000000);


	      //contains() 해당 문자를 포함하고 있는지 여부를 검사한다.
	      String str6 = "서울시 강남구";
	      String findStr = "서울";
	      boolean b1 = str6.contains(findStr);
	      System.out.println("contains()\t:"+b1);

	      //charAt 문자열의 해당위치의 문자를 char 타입으로 반환한다.
	      String str7 = "가나다라마바사아자차카타파하";
	      System.out.println("charAt()\t:"+str7.charAt(3));

	      //concat 문자열을 합친다. +와 같은 동작
	      String str8 = "hello world!!!!";
	      String conStr = "Bye Hello world!!!";
	      System.out.print("concat()\t:");
	      System.out.println(str8.concat(conStr));
	   


		
	}
}
