package JavaPackage;

import java.util.Scanner;

public class GuviTasks5_Q3 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = obj.nextInt();
		
		int count = 1;

		for (int i = 1; i <= num; i++) {

			for (int j = 0; j <= i - 1; j++) {
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}

	}

}

