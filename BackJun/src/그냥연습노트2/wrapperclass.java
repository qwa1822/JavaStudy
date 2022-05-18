package 그냥연습노트2;

public class wrapperclass {

	public static void main(String[] args) {

		int num=123;
		String str1;
		str1=String.valueOf(num);
		System.out.println(".valueOf :"+str1);
		
		//int형 변수를 Integer클래스로 전환
		 //.intValue() : wrapper 클래스 안에 숫자(int타입)를 가져오는 함수
		
		int i1=123;
		Integer int1=new Integer(i1);		//일반 변수를 wrapper class로 변환
		int num1=int1.intValue();
		System.out.println(".intvalue() :"+num1);
		
		
		  //.toString() : 숫자를 문자열로 변환
		System.out.println("toString() : "+int1.toString()+10); //연산이 진행되지 않고 뒤에 10이 더해져 출력된다. int1이 문자열로 형이 변환되었음을 의미한다.
		System.out.println(int1+10);		   //연산이 진행되어 10을 더한 값이 출력된다.
		
		
		//parseInt():문자열을 숫자로 변환
		String str2="123";
		int i2=Integer.parseInt(str2);		//숫자가 아닌 문자가 포함되어 있다면 에러가 발생한다
		System.out.println("parseInt()"+ (i2+10));	 //i1의 123은 문자열이 아닌 int형으로 형이 변환되어 10을 더한 133이 출력된다.

		
		
		//숫자를 문자로 변환시키는 방법
		Integer _num=123;
		String str3_1=_num.toString();	 //정석은 .toString() 함수를 사용
		String str3_2=""+_num;		//이 방법은 자동으로 형을 변환한다.
		
		
		Double d1=new Double(3.14);
		Double d2=3.14;
		
		System.out.println("Double :"+ (d1+23));
		System.out.println("Double to String1:"+(d1.toString()+23));	 //타입이 String이므로 23을 뒤에 더한 문자열이 출력된다
		System.out.println("Double to String2:"+(d1+""+23));		//타입이 String이므로 23을 뒤에 더한 문자열이 출력된다
		
		

	    //문자열 -> 실수
		String str5="3.14";
		double d3=Double.parseDouble(str5);	 //int형은 .parseInt() , double형은 .parseDouble()을 사용한다.
		System.out.println(".parseDouble"+(d3+23));	  //타입이 Double형으로 변환되었기 때문에 연산이 된 값을 출력한다
		
	}
	
	
	
	
	

}
