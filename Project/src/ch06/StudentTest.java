package ch06;

public class StudentTest {

	public static void main(String[] args) {

		
		
		Student studentLee=new Student();
		
		
		System.out.println(studentLee.ShowStudentInfo());
		
		
		Student studentKim=new Student(123456,"kim",3);
		System.out.println(studentKim.ShowStudentInfo());
	}

}
