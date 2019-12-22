package AdventureGame;


public class VaultRoom extends BasicRoom implements Treasury {
	private TreasureProperty valuable;

	public VaultRoom(String name, String password, TreasureProperty item) {
		super(name, password);
		valuable = item;
	}

	public TreasureProperty yieldTreasure(PlayerBehavior p) {
		TreasureProperty answer = null;
		if (p == occupantOf() ) {
			answer = valuable;
			valuable = null;
		}
		return answer;
	}
}
