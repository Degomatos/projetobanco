package entities;

public class BankAccount {

	private int accountNumber;
	private String accountHolder;
	private double balance;
//Constructor
	public BankAccount() {
	}
	public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
//Getters and Setters
	public String getCustomerName() {
		return accountHolder;
	}
	public void setCustomerName(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
//Methods 
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	public void withdraw(double withdraw) {
		this.balance -= withdraw + 5.00;
	}
//toString	
	public String toString() {
		return "Account "
				+accountNumber
				+", Holder: "
				+accountHolder
				+", Balance: $ "
				+String.format("%.2f", balance);
	}
}
