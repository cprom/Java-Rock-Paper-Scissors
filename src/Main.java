import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		//get choice from player
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter:\n \"P\" for Paper\n \"R\" for Rock\n \"S\" for Scissors");
		String playerChoice = scanner.nextLine();
		
		if(playerChoice.equals("p")|| playerChoice.equals("P")) {
			playerChoice = "Paper";
		System.out.println("You chose " + playerChoice);
	}
		if(playerChoice.equals("r")|| playerChoice.equals("R")) {
			playerChoice = "Rock";
			System.out.println("You chose " + playerChoice);
		}
		if(playerChoice.equals("s")|| playerChoice.equals("S")) {
			playerChoice = "Scissors";
			System.out.println("You chose " + playerChoice);
		}
		
		//get choice from Computer
		
		String[] choiceArray = {"Rock","Paper","Scissors"};
		
		Random random = new Random();
		
		int cpuChoice = random.nextInt(choiceArray.length);
		
		System.out.println("Computer Chose " + choiceArray[cpuChoice]);
		
		//check winner
		
		if(playerChoice.equals(choiceArray[cpuChoice])) {
			System.out.println("It's a Tie");
		}
		if(playerChoice.equals("Paper") && choiceArray[cpuChoice].equals("Rock")) {
			System.out.println("Player Wins");
		}
		if(playerChoice.equals("Rock") && choiceArray[cpuChoice].equals("Scissors")) {
			System.out.println("Player Wins");
		}
		if(playerChoice.equals("Scissors") && choiceArray[cpuChoice].equals("Paper")) {
			System.out.println("Player Wins");
		}
		if(playerChoice.equals("Rock") && choiceArray[cpuChoice].equals("Paper")) {
			System.out.println("Computer Wins");
		}
		if(playerChoice.equals("Scissors") && choiceArray[cpuChoice].equals("Rock")) {
			System.out.println("Computer Wins");
		}
		if(playerChoice.equals("Paper") && choiceArray[cpuChoice].equals("Scissors")) {
			System.out.println("Computer Wins");
		}
		
	}
	
	
	
}
