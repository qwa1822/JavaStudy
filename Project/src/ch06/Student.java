package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	
	
	public Student(int studentNumber,String studentName, int grade) {
		this.studentName=studentName;
		this.studentNumber=studentNumber;
		this.grade=grade;
		
	
	}
	public Student() {
		
	}
	public String ShowStudentInfo() {
		
		
		return studentName+ "�л��� �й���"+studentNumber+"�̰�"
				+grade+"�г� �Դϴ�.";
	}
}

