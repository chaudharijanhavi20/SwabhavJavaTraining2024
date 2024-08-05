package Principle1;

import java.util.Random;
import java.util.Scanner;

public class PigGame {
	private static final int WINNING_SCORE = 20;
	private static final Scanner SCANNER = new Scanner(System.in);
	private final Random random;

	public PigGame() {
		this.random = new Random();
	}

	public static void main(String[] args) {
		new PigGame().playGame();
	}

	private void playGame() {
		int totalScore = 0;
		int turnScore = 0;
		while (totalScore < WINNING_SCORE) {
			turnScore = takeTurn(turnScore, totalScore);
		}
		System.out.println("You finished in " + totalScore + " turns!!");
		System.out.println("Game over!!");
	}

	private int takeTurn(int turnScore, int totalScore) {
		System.out.println("Your turn score : " + turnScore);
		String choice = getChoice();

		int die = rollDie();
		System.out.println("You rolled :" + die);

		turnScore = processRoll(turnScore, die);
		totalScore = handleHold(totalScore, turnScore, choice);

		return turnScore;
	}

	private String getChoice() {
		System.out.println("Roll or hold?");
		String choice = SCANNER.nextLine().toLowerCase();
		return isValidChoice(choice) ? choice : getChoice();
	}

	private boolean isValidChoice(String choice) {
		return choice.equals("roll") || choice.equals("hold");
	}

	private int rollDie() {
		return random.nextInt(6) + 1;
	}

	private int processRoll(int turnScore, int die) {
		return die == 1 ? 0 : turnScore + die;
	}

	private int handleHold(int totalScore, int turnScore, String choice) {
		return choice.equals("h") ? totalScore + turnScore : totalScore;
	}
}
