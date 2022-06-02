package ch23;

public class StudentClassListTest {

	public static void main(String[] args) {

		
		Student studentLee=new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim=new Student(1002,"kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 50);
		studentKim.addSubject("영어", 75);
		
		studentLee.showScoreInfo();
		
		System.out.println("================");
		studentKim.showScoreInfo();
		
		
	}

}
