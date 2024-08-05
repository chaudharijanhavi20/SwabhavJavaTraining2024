package H1;

import java.util.Scanner;

public class ATMTransaction {
	public static void main(String[] args) {
		double balance = 1000.00;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("ATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.print("Please choose an option: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Your current balance is: $" + balance);
				break;
			case 2:
				System.out.print("Enter amount to deposit: ");
				double depositAmount = scanner.nextDouble();
				balance += depositAmount;
				System.out.println("You have deposited $" + depositAmount + ". Your new balance is $" + balance);
				break;
			case 3:
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				if (withdrawAmount <= balance) {
					balance -= withdrawAmount;
					System.out.println("You have withdrawn $" + withdrawAmount + ". Your new balance is $" + balance);
				} else {
					System.out.println("Insufficient funds!");
				}
				break;
			case 4:
				System.out.println("Thank you for using the ATM. Goodbye!");
				break;
			default:
				System.out.println("Invalid input. Please select correct option");
			}
		}
	}
}
