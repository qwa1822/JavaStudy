package ch17;

public class Company {

	private static Company instance = new Company(); // �����Ѱ�ü �ܺο��� �����ֵ��� �����ؾ���.

	private Company() {

	}

	public static Company getInstance() {
		
		if(instance==null) {
			instance=new Company();
		}
		
			return instance;

	}
}
