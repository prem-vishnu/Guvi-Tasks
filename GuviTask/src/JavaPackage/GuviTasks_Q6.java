//Question6

package JavaPackage;

import java.util.Scanner;

public class GuviTasks_Q6 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = obj.nextInt();

		int fact = 1;

		if (n < 0) {
			System.out.println("Factorial is defined only for positive numbers");
		} else {

			for (int i = n; i > 0; i--) {

				fact = fact * i;

			}
			System.out.println("The factorial of the number is " + fact);

		}
	}

}
