package �׳ɿ�����Ʈ2;

public class wrapperclass {

	public static void main(String[] args) {

		int num=123;
		String str1;
		str1=String.valueOf(num);
		System.out.println(".valueOf :"+str1);
		
		//int�� ������ IntegerŬ������ ��ȯ
		 //.intValue() : wrapper Ŭ���� �ȿ� ����(intŸ��)�� �������� �Լ�
		
		int i1=123;
		Integer int1=new Integer(i1);		//�Ϲ� ������ wrapper class�� ��ȯ
		int num1=int1.intValue();
		System.out.println(".intvalue() :"+num1);
		
		
		  //.toString() : ���ڸ� ���ڿ��� ��ȯ
		System.out.println("toString() : "+int1.toString()+10); //������ ������� �ʰ� �ڿ� 10�� ������ ��µȴ�. int1�� ���ڿ��� ���� ��ȯ�Ǿ����� �ǹ��Ѵ�.
		System.out.println(int1+10);		   //������ ����Ǿ� 10�� ���� ���� ��µȴ�.
		
		
		//parseInt():���ڿ��� ���ڷ� ��ȯ
		String str2="123";
		int i2=Integer.parseInt(str2);		//���ڰ� �ƴ� ���ڰ� ���ԵǾ� �ִٸ� ������ �߻��Ѵ�
		System.out.println("parseInt()"+ (i2+10));	 //i1�� 123�� ���ڿ��� �ƴ� int������ ���� ��ȯ�Ǿ� 10�� ���� 133�� ��µȴ�.

		
		
		//���ڸ� ���ڷ� ��ȯ��Ű�� ���
		Integer _num=123;
		String str3_1=_num.toString();	 //������ .toString() �Լ��� ���
		String str3_2=""+_num;		//�� ����� �ڵ����� ���� ��ȯ�Ѵ�.
		
		
		Double d1=new Double(3.14);
		Double d2=3.14;
		
		System.out.println("Double :"+ (d1+23));
		System.out.println("Double to String1:"+(d1.toString()+23));	 //Ÿ���� String�̹Ƿ� 23�� �ڿ� ���� ���ڿ��� ��µȴ�
		System.out.println("Double to String2:"+(d1+""+23));		//Ÿ���� String�̹Ƿ� 23�� �ڿ� ���� ���ڿ��� ��µȴ�
		
		

	    //���ڿ� -> �Ǽ�
		String str5="3.14";
		double d3=Double.parseDouble(str5);	 //int���� .parseInt() , double���� .parseDouble()�� ����Ѵ�.
		System.out.println(".parseDouble"+(d3+23));	  //Ÿ���� Double������ ��ȯ�Ǿ��� ������ ������ �� ���� ����Ѵ�
		
	}
	
	
	
	
	

}
