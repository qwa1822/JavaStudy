package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		
		Student studentLee=new Student(100,"梯熱團");
		studentLee.setKoreaSubject("措橫", 100);
		studentLee.setMathSubject("熱з", 70);
		
		
		Student studentkim=new Student(200,"kim");
		studentkim.setKoreaSubject("措橫", 50);
		studentkim
		.setMathSubject("熱з", 65);
		
		studentLee.showScoreInfo();
		studentkim.showScoreInfo();
	}

}
