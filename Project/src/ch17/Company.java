package ch17;

public class Company {

	private static Company instance = new Company(); // 유일한객체 외부에서 쓸수있도록 설정해야함.

	private Company() {

	}

	public static Company getInstance() {
		
		if(instance==null) {
			instance=new Company();
		}
		
			return instance;

	}
}
