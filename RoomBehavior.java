package AdventureGame;

public interface RoomBehavior {
	public boolean enter(PlayerBehavior p);

	public void exit(PlayerBehavior p);

	public PlayerBehavior occupantOf();

}
