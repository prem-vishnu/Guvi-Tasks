//Question5

package task4;

import java.util.Scanner;

public class GuviTasks4_Q5 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		boolean isPrime = true;

		System.out.println("Enter a number");
		int num = obj.nextInt();

		if (num <= 1) {
			System.out.println(+num + " is not a prime number");
		}

		else {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {

					isPrime = false;
					break;

				}

			}
			if (isPrime == false) {
				System.out.println(+num + " is not a prime number");
			} else {
				System.out.println(+num + " is a prime number");
			}

		}
	}

}
