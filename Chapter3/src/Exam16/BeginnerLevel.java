package Exam16;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높게 점프했습니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴을 했습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****초보자 레벨입니디****");
	}


}
