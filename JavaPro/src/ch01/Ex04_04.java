package ch01;

public class Ex04_04 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;

		while (true) { // ���� �ݺ��� for(;;){}
			if (sum > 100)
				break; // break���� ����Ǹ�
			++i; // �̺κ��� ��������ʰ� while���� �����.
			sum += i;

		} // end of while
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
