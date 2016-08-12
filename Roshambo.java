package rockPaperScissorsBoard;

import java.util.Scanner;

import rockPaperScissors.Human;
import rockPaperScissors.Opponent1;
import rockPaperScissors.Opponent10;
import rockPaperScissors.Opponent2;
import rockPaperScissors.Opponent3;
import rockPaperScissors.Opponent4;
import rockPaperScissors.Opponent5;
import rockPaperScissors.Opponent6;
import rockPaperScissors.Opponent7;
import rockPaperScissors.Opponent8;
import rockPaperScissors.Opponent9;

public class Roshambo {

	private static boolean stillPlaying = true;

	public static void main(String[] args) {
		Opponent1 aOpponent = new Opponent1();
		Opponent3 bOpponent = new Opponent3();
		Opponent2 cOpponent = new Opponent2();
		Opponent4 dOpponent = new Opponent4();
		Opponent5 eOpponent = new Opponent5();
		Opponent6 fOpponent = new Opponent6();
		Opponent7 gOpponent = new Opponent7();
		Opponent8 hOpponent = new Opponent8();
		Opponent9 iOpponent = new Opponent9();
		Opponent10 jOpponent = new Opponent10();
		
		String breakOut = null;

		Human aHuman = new Human();
		String player = null;
		String opponent = null;

		/*
		 * aHuman.Choice(); aOpponent.Choice(); bOpponent.Choice();
		 * cOpponent.Choice();
		 */

		Scanner keyboard = new Scanner(System.in);
		String userInput;
		while (stillPlaying) {
			do {
				System.out.println();
				System.out.println("Hello welcome to our Rock, Paper, Scissors");
				System.out.println("Which player would you like to face today:");
				System.out.println("");
				System.out.println("Choose 1 for Bob(He's Easy) \n" + "Choose 2 for Sherry(She's a little more Challenging) \n" 
				+ "Choose 3 for Carl(He's a Pro) \n" + "Choose 4 for Zander(He's a Master) \n"
				+ "All opponents from 5 - 10 are all Expert level \n"
				+ "Choose 5 for Jason \n" + "Choose 6 for Edgar\n"+ "Choose 7 for Beth\n"
				+ "Choose 8 for Aniya\n" +"Choose 9 for Zarinah\n" +"Choose 10 for Roland");
				
				userInput = keyboard.nextLine();
				Human.numberVal(userInput);
			} while (Human.numberVal(userInput));

			switch (userInput) {
			case "1":

				player = aHuman.Choice();

				opponent = eOpponent.Choice();
				Roshambo.ThrowDown(player, opponent);

				break;

			case "2":

				player = aHuman.Choice();

				opponent = dOpponent.Choice();
				Roshambo.ThrowDown(player, opponent);
				break;

			case "3":

				player = aHuman.Choice();

				opponent = aOpponent.Choice();
				Roshambo.ThrowDown(player, opponent);
				break;
				
			case "4":

				player = aHuman.Choice();

				opponent = cOpponent.Choice();
				Roshambo.ThrowDown(player, opponent);
				break;
				
			case "5":

				player = aHuman.Choice();

				opponent = bOpponent.Choice();
				Roshambo.ThrowDown(player, opponent);
				break;
			case "6":

				player = aHuman.Choice();

				opponent = fOpponent.Choice();
				Roshambo.ThrowDown(player, opponent);
				break;
				
			case "7":

				player = aHuman.Choice();

				opponent = gOpponent.Choice();
				Roshambo.ThrowDown(player, opponent);
				break;
				
			case "8":

				player = aHuman.Choice();

				opponent = hOpponent.Choice();
				Roshambo.ThrowDown(player, opponent);
				break;
				
			case "9":

				player = aHuman.Choice();

				opponent = iOpponent.Choice();
				Roshambo.ThrowDown(player, opponent);
				break;
				
			case "10":

				player = aHuman.Choice();

				opponent = jOpponent.Choice();
				Roshambo.ThrowDown(player, opponent);
				break;
				
			


			default:

				break;
			}
			System.out.println("Would you like to continue?");
			System.out.println("Please Enter Yes or No.");
			breakOut = keyboard.nextLine();

			do {
				switch (breakOut.toLowerCase()) {
				case "yes":
					stillPlaying = true;
					break;

				case "no":
					stillPlaying = false;
					break;

				default:

					break;
				}
			} while (!breakOut.equals("yes") && !breakOut.equals(("no")));
		}

	}

	public static void ThrowDown(String player, String Opponent) {

		if (player.equals(Opponent)) {
			System.out.println("Its a tie");
		} else if ((player.equals("Rock")) && (Opponent.equals("Paper"))) {
			System.out.println("Paper covers Rock, You Lose. Maybe next time.");
		} else if ((player.equals("Rock")) && (Opponent.equals("Scissors"))) {
			System.out.println("Rock break Scissors, You Win!!!");
		} else if ((player.equals("Rock")) && (Opponent.equals("Lizard"))) {
			System.out.println("Rock crushes Lizard, You Win!!!");
		} else if ((player.equals("Rock")) && (Opponent.equals("Spock"))) {
			System.out.println("Spock vaporizes Rock, You Lose. Maybe next time.");
		} else if ((player.equals("Paper")) && (Opponent.equals("Rock"))) {
			System.out.println("Paper covers Rock, You win!!!");
		} else if ((player.equals("Paper")) && (Opponent.equals("Scissors"))) {
			System.out.println("Scissors cut Paper, You Lose. Maybe next time.");
		} else if ((player.equals("Paper")) && (Opponent.equals("Lizard"))) {
			System.out.println("Lizard eats Paper, You Lose. Maybe next time.");
		} else if ((player.equals("Paper")) && (Opponent.equals("Spock"))) {
			System.out.println("Paper disproves Spock, You win!!!");
		} else if ((player.equals("Scissors")) && (Opponent.equals("Rock"))) {
			System.out.println("Rock breaks Scissors, You Lose. Maybe next time.");
		} else if ((player.equals("Scissors")) && (Opponent.equals("Paper"))) {
			System.out.println("Scissors cut Paper, You Win!!!");
		} else if ((player.equals("Scissors")) && (Opponent.equals("Lizard"))) {
			System.out.println("Scissors decapitate Lizard, You Win!!!");
		} else if ((player.equals("Scissors")) && (Opponent.equals("Spock"))) {
			System.out.println("Spock smashes Scissors, You Lose. Maybe next time.");
		} else if ((player.equals("Lizard")) && (Opponent.equals("Paper"))) {
			System.out.println("Lizard eats Paper, You Win!!!");
		} else if ((player.equals("Lizard")) && (Opponent.equals("Rock"))) {
			System.out.println("Rock crushes Lizard, You Lose. Maybe next time.");
		} else if ((player.equals("Lizard")) && (Opponent.equals("Scissors"))) {
			System.out.println("Scissors decapitate Lizard, You Lose. Maybe next time.");
		} else if ((player.equals("Lizard")) && (Opponent.equals("Spock"))) {
			System.out.println("Lizard poisons Spock, You Win!!!");
		} else if ((player.equals("Spock")) && (Opponent.equals("Rock"))) {
			System.out.println("Spock vaporizes Rock, You Win!!!");
		} else if ((player.equals("Spock")) && (Opponent.equals("Paper"))) {
			System.out.println("Paper disproves Spock, You Lose. Maybe next time.");
		} else if ((player.equals("Spock")) && (Opponent.equals("Scissors"))) {
			System.out.println("Spock smashes Scissors, You Win!!!");
		} else if ((player.equals("Spock")) && (Opponent.equals("Lizard"))) {
			System.out.println("Lizard poisons Spock, You Lose. Maybe next time.");
		}

	}

	public static boolean YesNo(String yesNo) {
		boolean choice = false;
		if (yesNo.equals("yes") && yesNo.equals("no")) {

		}

		return choice;
	}

}
