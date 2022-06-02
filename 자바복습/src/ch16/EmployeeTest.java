package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.setEmployeeName("이순신");

		
		System.out.println(Employee.getSeraalNum());
		
		
		
		Employee employeekim=new Employee();
		
		
		employeekim.setEmployeeName("김유신");
		
		
		
		System.out.println(employee.getEmployeeId()+"님의 사원번호입니다.");
		System.out.println(employeekim.getEmployeeId()+"님의 사원번호입니다.");
		
	
	}

}

