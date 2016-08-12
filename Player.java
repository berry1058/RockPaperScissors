package rockPaperScissors;

public abstract class Player {

	protected String name = null;

	public Player(String name) {
		this.name = name;
	}

	public Player() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String Choice();

	public abstract void numberVal();

}
