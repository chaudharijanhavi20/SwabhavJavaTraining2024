package Package;

import java.util.Scanner;

import Model.Voter;
import exceptions.AgeNotValidException;

public class VoterTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter voterid :");
		int votterId = scanner.nextInt();
		System.out.println("Enter your first name :");
		String fname = scanner.next();
		System.out.println("Enter your last name :");
		String lname = scanner.next();
		System.out.println("Enter your age :");
		int age = scanner.nextInt();
		try {
			Voter voter = new Voter(votterId, fname, lname, age);
			System.out.println(voter);
		} catch (AgeNotValidException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
