package ch01;

public class Ex04_04 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;

		while (true) { // 무한 반복문 for(;;){}
			if (sum > 100)
				break; // break문이 수행되면
			++i; // 이부분은 실행되지않고 while문을 벗어난다.
			sum += i;

		} // end of while
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
