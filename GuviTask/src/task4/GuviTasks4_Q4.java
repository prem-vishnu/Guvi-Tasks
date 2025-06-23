//Question4

package task4;
import java.util.Scanner;

public class GuviTasks4_Q4 {

	public static void main(String[] args) {
		
		int num1, num2; 
		
		Scanner obj = new Scanner(System.in);
	
		System.out.println("Enter number 1");
	    num1 = obj.nextInt();
	    
	    System.out.println("Enter number 2");
		num2 = obj.nextInt();
		
		int swap = num1;
		num1 = num2;
		num2 = swap;
		
		System.out.println("Number 1 = "+num1);
		System.out.println("Number 2 = "+num2);

	}

}
