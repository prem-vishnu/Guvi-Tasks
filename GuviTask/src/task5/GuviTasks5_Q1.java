//Palindrome

package task5;

import java.util.Scanner;

public class GuviTasks5_Q1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = obj.next();

		int i, j = 0;
		boolean isPal = true;

		for(i = str.length() - 1; i > j; i--) {
			
			if (str.charAt(i) == str.charAt(j)){
				isPal = true;
			} else {
				isPal = false;
			}
			
			j++;
		}

		if (isPal == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}