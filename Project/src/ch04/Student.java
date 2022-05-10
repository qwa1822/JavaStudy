package ch04;

public class Student {
	
	public int studentID;
	public String StudentName;
	public String address;
	
	
	
public String getStudentName() {
	return StudentName;
}


public String setStudentName(String s) {
	return StudentName=s;
}


public void showStudentInfo() {
	System.out.println(studentID+"의 이름은"+StudentName+"이고 주소는"+
			address+"입니다.");
}



}
