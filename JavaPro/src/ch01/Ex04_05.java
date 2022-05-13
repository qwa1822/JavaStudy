package ch01;

public class Ex04_05 {

	public static void main(String[] args) {

		for(int i=0; i<=10; i++) {
			if(i%3==0)
				continue;     //3의배수 제외
							//출력하고 증감식으로가서 증가
			System.out.println(i);
		}
	}

}
