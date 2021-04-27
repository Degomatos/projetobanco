package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount conta1;
		
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there an intial deposit? (y/n): ");
		char option = sc.next().charAt(0);
		System.out.println();
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			conta1 = new BankAccount(accountNumber,accountHolder,deposit);
		} else {
			conta1 = new BankAccount(accountNumber,accountHolder);
		}
		
		System.out.println("Account data:");
		System.out.println(conta1);
	
		System.out.println();
		System.out.print("Enter a deposit value: ");
		conta1.deposit(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(conta1);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		conta1.withdraw(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(conta1);
		
		sc.close();
	}

}
