package H1;

import java.util.Random;
import java.util.Scanner;

public class PigGame {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int totalScore = 0;
		int turnScore = 0;
		while (totalScore < 20) {
			System.out.println("Your turn score : " + turnScore);
			System.out.println("Role or hole?(r/h)");
			String choice = sc.nextLine();

			if (choice.equalsIgnoreCase("r")) {
				int die = random.nextInt(6) + 1;
				System.out.println("You rolled :" + die);
				if (die == 1) {
					turnScore = 0;
					System.out.println("You rolled a 1! Turn over.");
				} else {
					turnScore += die;
				}
			} else if (choice.equalsIgnoreCase("h")) {
				totalScore += turnScore;
				turnScore = 0;
				System.out.println("Your held ,your total score is:" + totalScore);
			} else {
				System.out.println("Invalid input.Please enter r or h");
			}
		}

		System.out.println("You finished in " + (totalScore) + " turns!!");
		System.out.println("Game over!!");

	}

	
}
