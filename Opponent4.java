package rockPaperScissors;

import java.util.Random;

public class Opponent4 extends Users {

	String[] rPS = new String[] { "Rock", "Paper", "Scissors" };

	public Opponent4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Opponent4(String name, String gender) {
		super(name, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Choice() {

		String choice = (rPS[new Random().nextInt((rPS.length) - 3)]);
		System.out.println("Your opponent has chosen " + choice);
		System.out.println();
		return choice;
	}

	@Override
	public void numberVal() {
		// TODO Auto-generated method stub

	}
}
