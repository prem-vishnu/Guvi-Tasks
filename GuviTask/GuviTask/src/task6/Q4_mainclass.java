package task6;

public class Q4_mainclass {

	public static void main(String[] args) {

		Account acc1 = new Account("Prem", 50000.0f);

		acc1.deposit();
		acc1.checkBalance();
		acc1.withdraw();
		acc1.checkBalance();

		Account acc2 = new Account();

		acc2.deposit();
		acc2.checkBalance();
		acc2.withdraw();
		acc2.checkBalance();

	}

}
