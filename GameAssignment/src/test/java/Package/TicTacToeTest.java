package Package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
	private TicTacToe game;

	@BeforeEach
	public void setUp() {
		game = new TicTacToe();
	}

	@Test
	public void testBoardInitialization() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				assertEquals(Player.EMPTY, game.getBoard()[i][j]);
			}
		}
	}

	@Test
	public void testCurrentPlayerInitialization() {
		assertEquals(Player.X, game.getCurrentPlayer());
	}

	@Test
	public void testPlayValidMove() {
		game.play(0, 0);
		assertEquals(Player.X, game.getBoard()[0][0]);
		assertEquals(Player.O, game.getCurrentPlayer());
	}

	@Test
	public void testPlayOutOfBounds() {
		assertThrows(IllegalArgumentException.class, () -> game.play(-1, 0));
		assertThrows(IllegalArgumentException.class, () -> game.play(0, 3));
	}

	@Test
	public void testPlayOnOccupiedSpot() {
		game.play(1, 0);
		assertThrows(IllegalStateException.class, () -> game.play(1, 0));
	}

	@Test
	public void testWinInRow() {
		game.play(0, 0); 
		game.play(1, 0); 
		game.play(0, 1); 
		game.play(1, 1); 
		game.play(0, 2); 
		assertTrue(game.isGameOver());
		assertEquals(Player.X, game.getWinner());
	}

	@Test
	public void testWinInColumn() {
		game.play(0, 0); 
		game.play(0, 1); 
		game.play(1, 0); 
		game.play(1, 1); 
		game.play(2, 0); 
		assertTrue(game.isGameOver());
		assertEquals(Player.X, game.getWinner());
	}

	@Test
	public void testWinInDiagonal() {
		game.play(0, 0); 
		game.play(1, 0); 
		game.play(1, 1); 
		game.play(2, 0); 
		game.play(2, 2); 
		assertTrue(game.isGameOver());
		assertEquals(Player.X, game.getWinner());
	}

	@Test
	public void testDraw() {
		game.play(0, 0); 
		game.play(0, 1);
		game.play(0, 2);
		game.play(1, 0); 
		game.play(1, 2); 
		game.play(1, 1); 
		game.play(2, 0); 
		game.play(2, 2); 
		game.play(2, 1); 
		assertTrue(game.isGameOver());
		assertEquals(Player.EMPTY, game.getWinner());
	}
}
