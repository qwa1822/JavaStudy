package �迭;

import java.util.Arrays;

public class ch5_6 {
	
	
	public static void main(String [] args) {
		
	
		
		int[] iArr= {100,95,80,70,60};
		
		//�迭�� ����Ű�� �������� iArr�� ���� ����Ѵ�.
		System.out.println(iArr);
		
		for(int i=0; i<iArr.length; i++) {  //�迭�� ��Ҹ� �ϳ��� ���
			System.out.println(iArr[i]);
		}
		
		
		//�迭 iArr�� ����Ҹ� ����Ѵ� [100,95,80,60,60]�� ��µȴ�
		//���ڿ��� �ٲ��ִ� ��.
		System.out.println(Arrays.toString(iArr));
	}

}
