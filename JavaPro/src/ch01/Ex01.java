package ch01;

public class Ex01 {
	
	public static void  main(String args[]) {
	double pi=3.141592;
	double shortPI=Math.round(pi*1000)/1000.0;    //n��������
	System.out.println(shortPI);
	
	//�Ǽ��� �����ιٲ�� ���� ����
	System.out.println((int)(pi*1000)/1000.0);    //3.141 ���
	
	}
}
