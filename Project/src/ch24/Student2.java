package ch24;

import java.util.ArrayList;

public class Student2 {

	int studentId;
	String studentName;
	
	
	
	ArrayList<Subject2> subjectList2;
	
	
	Student2(int studentId,String name){
		this.studentId=studentId;
		this.studentName=name;
		
		subjectList2=new ArrayList<>();
		
	}
	
	
	public void addsubjectList(String name,int score) {
		Subject2 sub=new Subject2();
		sub.SetName(name);
		sub.SetScore(score);
		
		
		subjectList2.add(sub);
	}
	
	
	public void showScoreInfo() {
		int total=0;
		
		
		for(Subject2 sub:subjectList2) {
			total+=sub.getScore();
			System.out.println(studentName+"의 학생의 "+sub.getname()+"의 성적은"+sub.getScore()+"입니다");
			
		}
		System.out.println(studentName+"의 총점은"+total+"입니다");
		
		
		
	}
	


}
