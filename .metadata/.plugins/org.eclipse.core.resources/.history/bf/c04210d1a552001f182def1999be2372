package Package;

import java.util.Scanner;

public class GameFacad {
	private TicTacToe tictactoe;

	public GameFacad() {
		tictactoe = new TicTacToe();

	}

	public void playGame() {
		Scanner scanner = new Scanner(System.in);
		while (!tictactoe.isGameOver()) {
			tictactoe.Board();
			System.out.println("Enter Row and Column :");
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			tictactoe.play(row, column);
		}
		tictactoe.Board();
		System.out.println("Game Over !!");
	}
}
