package ch20;

public class CharArrayTest {

	public static void main(String[] args) {
		
		
		
		char[]alphbets=new char[26];
		char ch='A';    //65���� ���� �ƽ�Ű�ڵ�
		
		for(int i=0; i<alphbets.length; i++) {
			alphbets[i]=ch++;      //ch�� �ϳ��� ���� 65~90
		}
		
		for(char alpha:alphbets) {
			System.out.println(alpha+" ,"+ (int)alpha);
		}
	}
	

}
