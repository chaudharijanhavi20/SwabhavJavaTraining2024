package Tests;

import java.util.Scanner;
import Models.CricketPlayer;

public class CricketPlayerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CricketPlayer cricket[] = new CricketPlayer[3];
		for (int i = 0; i < cricket.length; i++) {
			System.out.print("Enter player id :");
			int playerId = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter name:");
			String name = sc.nextLine();
			System.out.print("Enter number of matches:");
			int numberOfMatches = sc.nextInt();
			System.out.print("Runs :");
			int runs = sc.nextInt();
			System.out.print("Enter wickets :");
			int wickets = sc.nextInt();
			cricket[i] = new CricketPlayer(playerId, name, numberOfMatches, runs, wickets);
		}
//		 for (int i = 0; i < cricket.length - 1; i++) {
//	            for (int j = 0; j < cricket.length - i - 1; j++) {
//	                if (cricket[j].calAverage() > cricket[j + 1].calAverage()) {
//	                    CricketPlayer temp = cricket[j];
//	                    cricket[j] = cricket[j + 1];
//	                    cricket[j + 1] = temp;
//	                }
//	            }
//	        }
		CricketPlayer.sortByAverageAscending(cricket);
		for (int i = 0; i < cricket.length; i++) {
			System.out.println("Player ID : " + cricket[i].getPlayerId());
			System.out.println("Name of Player : " + cricket[i].getName());
			System.out.println("Number of matches : " + cricket[i].getNumberOfMatches());
			System.out.println("Runs : " + cricket[i].getRuns());
			System.out.println("Wickets : " + cricket[i].getWickets());
			System.out.println("Average : " + cricket[i].calAverage());
		}
	}
}
