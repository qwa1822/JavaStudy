package Exam16;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("������ �����ݴϴ�.");
	}

	@Override
	public void turn() {

		System.out.println("���մϴ�.");
	}

	@Override
	public void showLevelMessage() {

		System.out.println("****** ����� �����Դϴ�. ******");
	}

}
