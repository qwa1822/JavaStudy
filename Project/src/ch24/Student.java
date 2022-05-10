package ch24;

import java.util.ArrayList;

public class Student {

	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList;     //subject를 배열로 생성
	

	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList=new ArrayList<>();
		
	}
	
	public void addSubject(String name,int point) {
		Subject subject=new Subject();		//배열생성
		subject.setName(name);				//이름
		subject.setScorePoint(point);     //점수
		
		
		subjectList.add(subject);      //전체 배열삽입
	}

	
	public void showScoreInfo() {

		int total=0;
		
		for(Subject subject: subjectList) {
			
			total+=subject.getScorePoint();
			System.out.println(studentName+"학생의 "+subject.getName()+"과목의 성적은"+
					subject.getScorePoint()+"입니다");
		}
		
		System.out.println(studentName + "학생의 총점은" + total + "입니다");
	}

}
