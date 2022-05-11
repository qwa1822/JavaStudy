package Exam16;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
	System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프를 했습니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴을 못합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("중급자 레벨입니다----------------------");
	}


}
