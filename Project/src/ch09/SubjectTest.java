package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		
	
		Student studentLee=new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 200);
		
		
		Student studentKim=new Student(200,"kim");
		studentKim.setKoreaSubject("����", 50);
		studentKim.setMathSubject("����", 65);
		
		
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
		
		
		
	}

}
