package ����;

public class StringFunctionClass {

	public static void main(String[] args) {
		
//replace()
		//ù���� ���ڴ� ��� ���ڿ�, �ι������ڴ� �ٲٷ��� ���ڿ�
		
		String str="A*B*C*D*E*F*G*H";
		String temp=str.replace("*", "-");
		System.out.println("replace\t"+temp);

		
		   //split() tokken �� ����ؼ� ���ڿ��� �ڸ��� char[]�� ��ȯ�ȴ�.
	      //tokken�� ������ ���� Ư�� �����̴�. (*,&,^,% ... ���)
		String str2="hello world this is java, and hello world!";
		String charArr[]=str2.split(" ");
		for(int k=0; k<charArr.length; k++) {
			System.out.println("Split\t:"+charArr[k]);
		}
		
		

	      //substring() -> ������ ���ڸ� �߶� ������ (���� ��ġ, ���� ��ġ ��)
		String str3="Hello world!!!";
		String tempstr=str3.substring(2,5);
		System.out.println("substring\t:"+tempstr);
		

	      //toString() Ư�� �ڷ����� ���ڷ� ��ȯ�Ѵ�. (Wrapper Class���� �ַ� ���ȴ�.)
	      String str4 = "�ȳ��ϼ���, �ݰ�����";
	      System.out.println("toString():\t"+str4.toString());

	      //trim() ���ڿ� �հ� ���� ������ �����ش�. (�հ� �ڸ� ������)
	      String str5 ="         Hello          World        !!!           ";
	      System.out.println("trim()\t: "+str5+"(before)");
	      String trimStr = str5.trim();
	      System.out.println("trim()\t: "+trimStr+"(after)");

	      //valueOf() Ư�� Ÿ���� ���� ���ڿ��� ��ȯ���ش�.

	      int num= 123;
	      long lo = 1241323412L;
	      double dou = 123.45678;
	      //�Ʒ� ��� ����� ������ �ϴ� ���� �ƴ϶� ���ڿ��� ���� �����Ѵ�.
	      String iStr = String.valueOf(num);
	      System.out.println("valueOf()\t:"+iStr + 1000000);
	      String lStr = String.valueOf(lo);
	      System.out.println("valueOf()\t:"+lStr + 1000000);
	      String dStr = String.valueOf(dou);
	      System.out.println("valueOf()\t:"+dStr + 1000000);


	      //contains() �ش� ���ڸ� �����ϰ� �ִ��� ���θ� �˻��Ѵ�.
	      String str6 = "����� ������";
	      String findStr = "����";
	      boolean b1 = str6.contains(findStr);
	      System.out.println("contains()\t:"+b1);

	      //charAt ���ڿ��� �ش���ġ�� ���ڸ� char Ÿ������ ��ȯ�Ѵ�.
	      String str7 = "�����ٶ󸶹ٻ������īŸ����";
	      System.out.println("charAt()\t:"+str7.charAt(3));

	      //concat ���ڿ��� ��ģ��. +�� ���� ����
	      String str8 = "hello world!!!!";
	      String conStr = "Bye Hello world!!!";
	      System.out.print("concat()\t:");
	      System.out.println(str8.concat(conStr));
	   


		
	}
}
