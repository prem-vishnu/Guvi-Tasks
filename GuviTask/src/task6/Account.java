package task6;

import java.util.Scanner;

public class Account {

	private String Name;
	private float currentBalance;
	private float depositAmount;
	private float withdrawAmount;

	Scanner sc = new Scanner(System.in);

	public Account(String Name, float currentBalance) {
		this.Name = Name;
		this.currentBalance = currentBalance;

	}

	public Account() {

		System.out.println("Enter Name");
		this.Name = sc.nextLine();
		System.out.println("Enter current Balance");
		this.currentBalance = sc.nextFloat();
	}

	public float deposit() {

		System.out.println("Enter deposit amount");
		depositAmount = sc.nextFloat();

		currentBalance = currentBalance + depositAmount;

		return currentBalance;
	}

	public float withdraw() {

		System.out.println("Enter amount to withdraw");
		withdrawAmount = sc.nextFloat();
		if ((currentBalance > 0) && (withdrawAmount <= currentBalance)) {

			currentBalance = currentBalance - withdrawAmount;

		} else {
			System.out.println("Insufficient Balance");
		}

		return currentBalance;
	}
	
	public void checkBalance() {
		
		System.out.println("Account Holder: " +Name);
		System.out.println("Current Balance: "+currentBalance);
	}

}
