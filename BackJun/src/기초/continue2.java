package 기초;

import java.util.Scanner;

public class continue2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("학생은 몇명입니까?");
		int i = sc.nextInt();
		int score[] = new int[i];

		int sum = 0;

		int temp;
		int average = 0;

		for (int a = 0; a < score.length; a++) {

			System.out.println(a + 1 + "번쨰 학생의 점수를 입력하세요");
			temp = sc.nextInt();

			if (temp < 0) {
				System.out.println("올바르지 않습니다.");
				continue;
			}

			score[a] = temp;
			sum += score[a];

		}

		average = sum / i;
		System.out.println("총점은 " + sum + "입니다." + "평균은" + average + "입니다.");
	}

}
