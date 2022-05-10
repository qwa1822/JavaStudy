package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이명박");

		System.out.println(employeeLee.serialNum);

		Employee employeeKim = new Employee();

		employeeKim.setEmployeeName("김수신");

		System.out.println(employeeLee.getEmployeeId() + "님의 사번은" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeId() + "님의 사번은" + employeeKim.getEmployeeId());

	}

}
