package rockPaperScissors;

import java.util.Scanner;

public class Human extends Users {
	
	String[] rPS = new String[] { "Rock", "Paper", "Scissors", "Lizard", "Spock" };
	
	protected boolean userFailed = false;
	Scanner keyboard = new Scanner(System.in);
	protected int choiceNumber = 0;
	protected String userInput = null;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, String gender) {
		super(name, gender);
		// TODO Auto-generated constructor stub
	}

	public static boolean numberVal(String userInput) {

		if (userInput.equals("1") || userInput.equals("2") || userInput.equals("3") || userInput.equals("4") || userInput.equals("5")) {
			try {
				int number = Integer.parseInt(userInput);
				return false;

			} catch (NumberFormatException e) {

				return true;
			}
		}
		return false;
	}

	@Override
	public String Choice() {
		
		do{
		System.out.println("Would you like to throw: \n"
				+ "Rock (1) \n"
				+ "Paper (2) \n"
				+ "Scissors (3) \n"
				+ "Lizard (4) \n"
				+ "Spock (5) \n");
				
		userInput = keyboard.nextLine();
		
		userFailed = numberVal(userInput);
		
	}while(userFailed);
		
		int number = Integer.parseInt(userInput);
		
	String choice = rPS[number - 1];
	System.out.println("You have chose " + choice + ". Good Luck!!!");
	
		
	return choice;
	}
}
