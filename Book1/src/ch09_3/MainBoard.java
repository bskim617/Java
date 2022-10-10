package ch09_3;

public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		player.Play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.Play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.Play(3);
	}
}
