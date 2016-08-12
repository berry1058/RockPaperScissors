package rockPaperScissors;

public class Users extends Player {

	protected String gender = null;

	public Users(String name, String gender) {
		super(name);
		this.gender = gender;
	}

	public Users() {
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String Choice() {
		String string = null;
		// TODO Auto-generated method stub
		return string;
	}

	@Override
	public void numberVal() {
		// TODO Auto-generated method stub

	}

}
