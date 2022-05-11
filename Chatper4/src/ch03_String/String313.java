package ch03_String;

public class String313 {

	public static void main(java.lang.String[] args) {

		
		String str1=new String("Java");
		String android=new String("android");
		
		System.out.println(System.identityHashCode(str1));
		
		
		str1=str1.concat(android);
		
		System.out.println(str1);

		System.out.println(System.identityHashCode(str1));
	}

}
