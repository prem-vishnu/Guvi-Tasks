package task6;

public class Account {
	
	    private String accountHolderName;
	    private double balance;


	    public Account() {
	        this.accountHolderName = "Vishnu";
	        this.balance = 0.0;
	    }


	    public Account(String name, double initialBalance) {
	        this.accountHolderName = name;
	        this.balance = initialBalance;
	    }


	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance = balance + amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }


	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Invalid or insufficient balance.");
	        }
	    }


	    public void checkBalance() {
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Current Balance: " + balance);
	    }

}
