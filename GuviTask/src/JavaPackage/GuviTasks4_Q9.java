//Question 9

package JavaPackage;

import java.util.Scanner;

public class GuviTasks4_Q9 {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = obj.nextInt();

		if (age >= 60) {
			System.out.println("You are a senior citizen");
		} else {
			System.out.println("You are not a senior citizen");
		}

	}

}
