//Question2

package JavaPackage;
import java.util.Scanner;

public class GuviTasks4_Q2 {

	public static void main(String[] args) {
		
		int num; 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		num = obj.nextInt();
		
		if(num%2 == 0) {
			System.out.println(+num+ " is an even number");
		}
		else {
			System.out.println(+num+ " is an odd number");
		}

	}

}
