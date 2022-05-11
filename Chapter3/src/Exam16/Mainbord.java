package Exam16;

public class Mainbord {
	
	
	public static void Main(String [] args) {
		
		Player player=new Player();
		player.play(1);
		
		
		
		AdvancedLevel aLevel=new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel=new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		
	}

}
