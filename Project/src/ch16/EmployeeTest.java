package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̸��");

		System.out.println(employeeLee.serialNum);

		Employee employeeKim = new Employee();

		employeeKim.setEmployeeName("�����");

		System.out.println(employeeLee.getEmployeeId() + "���� �����" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeId() + "���� �����" + employeeKim.getEmployeeId());

	}

}
