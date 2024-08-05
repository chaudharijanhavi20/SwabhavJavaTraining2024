package H1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean playAgain = true;

		while (playAgain) {
			int numberToGuess = random.nextInt(100) + 1;
			int guess, attempts = 0;

			System.out.println("Random number generated: " + numberToGuess); // For testing

			while (true) {
				System.out.print("Guess a number (1-100): ");
				guess = scanner.nextInt();
				attempts++;

				if (guess == numberToGuess) {
					System.out.println("You won in attempt: " + attempts);
					break;
				} else if (guess < numberToGuess) {
					System.out.println("Sorry, too low");
				} else {
					System.out.println("Sorry, too high");
				}
			}

			System.out.print("Do you want to play again (yes/no)? ");
			String playAgainInput = scanner.next();
			playAgain = playAgainInput.equalsIgnoreCase("yes");
		}

		scanner.close();
		System.out.println("Thanks for playing!");
	}
}
