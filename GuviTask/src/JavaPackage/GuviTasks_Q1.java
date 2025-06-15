//Question_1

package JavaPackage;
import java.util.Scanner;

public class GuviTasks_Q1 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the value for a"); 
		a = obj.nextInt();
		
		System.out.println("Enter the value for b"); 
		b = obj.nextInt();
		
		System.out.println("Enter the value for c"); 
		c = obj.nextInt();
		
		System.out.println("Enter the value for d"); 
		d = obj.nextInt();
		
		int sum_AB = a+b;
		int sum_CD = c+d;
		
		if(sum_AB > sum_CD) {
			System.out.println("The sum of a and b is greater than the sum of c and d");
		}
		else {
			System.out.println("The sum of c and d is greater than the sum of a and b");
		}


	}

}
