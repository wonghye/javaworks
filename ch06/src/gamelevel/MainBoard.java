package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		
		Player player = new Player();
		//처음 생성시 비기너 레벨
		player.play(1);
		
		//중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		//고급자 레벨
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
