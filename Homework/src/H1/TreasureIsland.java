package H1;

import java.util.Scanner;

public class TreasureIsland {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to treasure island your mission is o find the treasure");

		System.out.println("left or right?");
		String choice1 = sc.next().toLowerCase();
		if (choice1.equals("left")) {
			System.out.println("swim or wait?");
			String choice2 = sc.next().toLowerCase();

			if (choice2.equals("wait")) {
				System.out.println("which door?(red/blue/yellow)");
				String choice3 = sc.next().toLowerCase();

				if (choice3.equals("red")) {
					System.out.println("Burned by fire.Game is over");
				} else if (choice3.equals("blue")) {
					System.out.println("Eaten by beasts.Game is over");
				} else if (choice3.equals("yellow")) {
					System.out.println("You win!!");
				} else {
					System.out.println("Gmae over");
				}

			} else {
				System.out.println("Attack by trout.Game over");
			}
		} else {
			System.out.println("Fall into hole.game over");
		}
	}
}
