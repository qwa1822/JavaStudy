package ch03;

public class studentTest {

	public static void main(String[] args) {

		
		
		int num=10;
		
		
		Student studentLee=new Student();
		
		
		
		
		studentLee.studentID=12345;
		studentLee.setStudentName("Lee");
		studentLee.address="서울시 강남구 역삼동";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim=new Student();
		studentKim.studentID=54321;
		studentKim.studentName="Kim";
		studentKim.address="경기도 성남시";
		
		
		studentKim.showStudentInfo();
		System.out.println(studentKim);
		System.out.println(studentLee);
	}

}
