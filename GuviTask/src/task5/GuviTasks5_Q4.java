package task5;

import java.util.Scanner;

public class GuviTasks5_Q4 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = obj.nextInt();

		int middle = (n / 2) + 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == middle && j == middle) {
					System.out.print("*");
				} else if (j == i || j == (n - i + 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}