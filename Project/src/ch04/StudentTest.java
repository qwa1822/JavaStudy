package ch04;

public class StudentTest {

	public static void main(String[] args) {

		
		
		int num=10;
		
		Student studentLee=new Student();  //student 하나를 생성하라.(인스턴스를 생성)
		
		
		studentLee.studentID=12345;
		studentLee.setStudentName("Lee");
		studentLee.address="서울 강남구 역삼동";
		
		
		
		
		studentLee.showStudentInfo();
		
		Student studentKim=new Student();
		
		studentKim.address="청주시";
		studentKim.studentID=12345;
		studentKim.StudentName="Kim";
		
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
		
		
		
		
		
		
	}

}
