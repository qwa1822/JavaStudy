package �׳ɿ�����Ʈ2;

public class array2Class {

	public static void main(String[] args) {

		// new int[ ��� �ڽ��� ���� ][ �Ķ� �ڽ��� ���� ];
		// ���� ������ �ʱ�ȭ�ϴ� ���

		int doubleArr[][] = new int[3][2]; // �ʷϻ� �ڽ� ����

		doubleArr[0][0] = 00; // �Ķ� �ڽ��� ����
		doubleArr[0][1] = 01;

		doubleArr[1][0] = 10;
		doubleArr[1][1] = 11;

		doubleArr[2][0] = 20;
		doubleArr[2][1] = 21;

		// ���� ����� ���ÿ� �ʱ�ȭ�ϴ� ���
		int doubleArr2[][] = { // �ʷϻ� �ڽ�

				{ 00, 01, 02 }, // ��� �ڽ�
				{ 10, 11, 12 }, { 20, 21, 22 }, { 30, 31, 32 } };

		// doubleArr.length�� 3�̴�.

		for (int i = 0; i < doubleArr.length; i++) {
			// doubleArr[i].length�� 2�̴�.
			for (int j = 0; j < doubleArr[i].length; j++) {
				System.out.println(" " + doubleArr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		for(int i=0; i<doubleArr2.length; i++) {
			  //doubleArr2[i].length�� 3�̴�.
			for(int j=0; j<doubleArr2[i].length; j++) {
				System.out.print(" "+doubleArr2[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	

}
