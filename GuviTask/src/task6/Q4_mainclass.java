package task6;

public class Q4_mainclass {

	public static void main(String[] args) {
		Account ac1 = new Account(); 
        ac1.checkBalance();
        ac1.deposit(2000);
        ac1.withdraw(700);
        ac1.checkBalance();

        System.out.println();

        Account ac2 = new Account("Prem", 20000); 
        ac2.checkBalance();
        ac2.withdraw(3000);  
        ac2.deposit(1500);
        ac2.withdraw(1000);
        ac2.checkBalance();

	}

}
