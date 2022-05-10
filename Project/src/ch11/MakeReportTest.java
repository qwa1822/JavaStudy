package ch11;

public class MakeReportTest {
	
	
	public static void main(String[] args) {
		
		
		MakReport builder=new MakReport();
		String report=builder.getReport();
		
		
		System.out.println(report);
	}

}
