package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.setEmployeeName("�̼���");

		
		System.out.println(Employee.getSeraalNum());
		
		
		
		Employee employeekim=new Employee();
		
		
		employeekim.setEmployeeName("������");
		
		
		
		System.out.println(employee.getEmployeeId()+"���� �����ȣ�Դϴ�.");
		System.out.println(employeekim.getEmployeeId()+"���� �����ȣ�Դϴ�.");
		
	
	}

}

