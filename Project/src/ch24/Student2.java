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
			System.out.println(studentName+"�� �л��� "+sub.getname()+"�� ������"+sub.getScore()+"�Դϴ�");
			
		}
		System.out.println(studentName+"�� ������"+total+"�Դϴ�");
		
		
		
	}
	


}
