package ch24;

public class ArrayListTest2 {

	public static void main(String[] args) {

		
		Student2 studentLee=new Student2(1001, "Lee");
		
		studentLee.addsubjectList("국어", 100);
		studentLee.addsubjectList("수학",50);
		
		Student2 studentKim=new Student2(1002,"kim");
		studentKim.addsubjectList("수학",50);
		studentKim.addsubjectList("국어",80);
		studentKim.addsubjectList("영어",75);
		
		
		studentLee.showScoreInfo();
		System.out.println("==========================");
		studentKim.showScoreInfo();
	}

}
