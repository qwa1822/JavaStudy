package ch04;

public class StudentTest {

	public static void main(String[] args) {

		
		
		int num=10;
		
		Student studentLee=new Student();  //student �ϳ��� �����϶�.(�ν��Ͻ��� ����)
		
		
		studentLee.studentID=12345;
		studentLee.setStudentName("Lee");
		studentLee.address="���� ������ ���ﵿ";
		
		
		
		
		studentLee.showStudentInfo();
		
		Student studentKim=new Student();
		
		studentKim.address="û�ֽ�";
		studentKim.studentID=12345;
		studentKim.StudentName="Kim";
		
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
		
		
		
		
		
		
	}

}
