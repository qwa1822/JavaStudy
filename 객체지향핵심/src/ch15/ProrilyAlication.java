package ch15;

public class ProrilyAlication implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("������� ���� ���� call�� ���� �����ɴϴ�");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���õ��� ���� �������� ���� ����մϴ�");	
	}

}
