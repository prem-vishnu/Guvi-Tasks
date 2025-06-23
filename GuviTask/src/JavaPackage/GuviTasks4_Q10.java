//Question10

package JavaPackage;

import java.util.Scanner;

public class GuviTasks4_Q10 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = obj.nextInt();
		int count = 0;

		if (number == 0) {
			count = 1;
		} else {

			while (number != 0) {

				number = number / 10;
				count++;
			}

		}
		System.out.println("The number of digits = " + count);

	}

}
