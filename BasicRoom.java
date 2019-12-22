package AdventureGame;

public class BasicRoom implements RoomBehavior {
	private PlayerBehavior occupant;
	private String rooms_name;
	private String secret_word;

	public BasicRoom(String name, String password) {
		occupant = null;
		rooms_name = name;
		secret_word = password;
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

}
