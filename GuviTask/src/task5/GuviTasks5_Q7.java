package task5;

import java.util.Scanner;

public class GuviTasks5_Q7 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("Enter the three numbers");
		num1 = obj.nextInt();
		num2 = obj.nextInt();
		num3 = obj.nextInt();

		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " is the largest among the three numbers");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " is the largest among the three numbers");
		} else {
			System.out.println(num3 + " is the largest among the three numbers");
		}
	}

}
