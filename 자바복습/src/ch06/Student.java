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
	
	
	public String showStudentInfo() {
		
		return studentName+"학생의 학번은"+studentNumber+"이고, 학년은"+grade+"입니다";
	}
}
