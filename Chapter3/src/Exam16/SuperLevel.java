package Exam16;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("존나게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프를 마구뜁니다.");
	}

	@Override
	public void turn() {

		System.out.println("턴합니다.");
	}

	@Override
	public void showLevelMessage() {

		System.out.println("****** 고급자 레벨입니다. ******");
	}

}
