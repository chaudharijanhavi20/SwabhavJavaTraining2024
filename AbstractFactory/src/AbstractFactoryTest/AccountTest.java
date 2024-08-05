package AbstractFactoryTest;

import java.util.Scanner;

import AbstractFactory.Model.BankAccountFactory;
import AbstractFactory.Model.IAccountFactory;

public class AccountTest {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IAccountFactory factory = new BankAccountFactory();
	} 
}
