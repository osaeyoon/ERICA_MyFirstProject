package AdventureGame;

public class Explorer implements PlayerBehavior {
	private String my_name;
	private String my_secret_word;
	private RoomBehavior where_I_am_now;

	public Explorer(String name, String word) {
		my_name = name;
		my_secret_word = word;
		where_I_am_now = null;
	}

	public String speak() { return my_secret_word; }

	public void exitRoom() {
		if (where_I_am_now != null) {
			where_I_am_now.exit(this);
			where_I_am_now = null;
		}
	}

	public boolean explore(RoomBehavior r) {
		if (where_I_am_now != null) { exitRoom(); }
		boolean went_inside = r.enter(this);
		if (went_inside) { where_I_am_now = r; }
		
		return went_inside;
	}

	public RoomBehavior locationOf() { return where_I_am_now; }

}
