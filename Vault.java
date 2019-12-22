package AdventureGame;

public class Vault implements RoomBehavior, Treasury {
	private PlayerBehavior occupant;
	private String rooms_name;
	private String secret_word;

	private TreasureProperty valuable;

	public Vault(String name, String password, TreasureProperty item) {
		occupant = null;
		rooms_name = name;
		secret_word = password;
		valuable = item;
	}

	public boolean enter(PlayerBehavior p) {
		boolean result = false;
		if (occupant == null && secret_word.equals(p.speak())) {
			occupant = p;
			result = true;
		}
		return result;
	}

	public void exit(PlayerBehavior p) {
		if (occupant == p) { occupant = null; }
	}

	public PlayerBehavior occupantOf() { return occupant; }

	public TreasureProperty yieldTreasure(PlayerBehavior p) {
		TreasureProperty answer = null;
		if (p == occupant) {
			answer = valuable;
			valuable = null;
		}
		return answer;
	}

}
