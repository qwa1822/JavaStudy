package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		
		Student studentLee=new Student(100,"�����");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 70);
		
		
		Student studentkim=new Student(200,"kim");
		studentkim.setKoreaSubject("����", 50);
		studentkim
		.setMathSubject("����", 65);
		
		studentLee.showScoreInfo();
		studentkim.showScoreInfo();
	}

}
