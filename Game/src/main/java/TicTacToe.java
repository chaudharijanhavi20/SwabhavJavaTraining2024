
import java.util.Scanner;

public class TicTacToe implements IGame {
	private Player[][] board;
	private Player currentPlayer;

	public TicTacToe() {
		board = new Player[3][3];
		initializeBoard();
		currentPlayer = Player.X;
	}

	public void initializeBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Player.EMPTY;
			}
		}
	}

	public void Board() {
		System.out.println(" -------------");
		for (int i = 0; i < board.length; i++) {
			System.out.print(" | ");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] == Player.EMPTY ? " " : board[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
			System.out.println(" -------------");
		}
	}

	@Override
	public void play(int x, int y) {
		try {
			if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
				throw new IllegalArgumentException("Please enter values between 0 and 2.");
			}
			if (board[x][y] != Player.EMPTY) {
				throw new IllegalStateException("Place is already occupied.");
			}
			board[x][y] = currentPlayer;
			currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;
		} catch (IllegalArgumentException | IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public boolean isGameOver() {
		Player winner = getWinner();
		if (winner != Player.EMPTY) {
			System.out.println("Player " + winner + " wins!");
			return true;
		}
		if (isBoardFull()) {
			System.out.println("The game is a draw!");
			return true;
		}
		return false;
	}

	private Player getWinner() {
		Player winner = checkRows();
		if (winner != Player.EMPTY) {
			return winner;
		}
		winner = checkColumns();
		if (winner != Player.EMPTY) {
			return winner;
		}
		return checkDiagonals();
	}

	private Player checkRows() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != Player.EMPTY) {
				return board[i][0];
			}
		}
		return Player.EMPTY;
	}

	private Player checkColumns() {
		for (int i = 0; i < 3; i++) {
			if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != Player.EMPTY) {
				return board[0][i];
			}
		}
		return Player.EMPTY;
	}

	private Player checkDiagonals() {
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != Player.EMPTY) {
			return board[0][0];
		}
		if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != Player.EMPTY) {
			return board[0][2];
		}
		return Player.EMPTY;
	}

	private boolean isBoardFull() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == Player.EMPTY) {
					return false;
				}
			}
		}
		return true;
	}

}
