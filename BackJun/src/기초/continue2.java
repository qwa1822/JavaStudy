package ����;

import java.util.Scanner;

public class continue2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�л��� ����Դϱ�?");
		int i = sc.nextInt();
		int score[] = new int[i];

		int sum = 0;

		int temp;
		int average = 0;

		for (int a = 0; a < score.length; a++) {

			System.out.println(a + 1 + "���� �л��� ������ �Է��ϼ���");
			temp = sc.nextInt();

			if (temp < 0) {
				System.out.println("�ùٸ��� �ʽ��ϴ�.");
				continue;
			}

			score[a] = temp;
			sum += score[a];

		}

		average = sum / i;
		System.out.println("������ " + sum + "�Դϴ�." + "�����" + average + "�Դϴ�.");
	}

}
