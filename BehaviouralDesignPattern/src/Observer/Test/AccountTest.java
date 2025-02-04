package Observer.Test;

import java.util.Scanner;

import Observer.Model.Account;
import Observer.Model.EmailNotifier;
import Observer.Model.InsufficientFundsException;
import Observer.Model.SMSNotifier;
import Observer.Model.WhatsAppNotifier;

public class AccountTest {
	public static void main(String[] args) throws InsufficientFundsException {
		Account account = new Account(123, "Janhavi", 1000);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose notification type");
		System.out.println("1.SMS Notification");
		System.out.println("2.Email Notification");
		System.out.println("3.WhatApp Notification");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			account.registerNotifier(new SMSNotifier());
			break;
		case 2:
			account.registerNotifier(new EmailNotifier());
			break;
		case 3:
			account.registerNotifier(new WhatsAppNotifier());
			break;
		default:
			System.out.println("Invalid choice");
		}

//		account.deposit(500);
		try {
		account.withdraw(800);
		}catch(InsufficientFundsException exception) {
			System.out.println(exception);
		}

	}
}
