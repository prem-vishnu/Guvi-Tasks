package task5;
import java.util.Scanner;

public class GuviTasks5_Q2 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = obj.next();
		
		String revStr = ""; 
		
		for(int i = ((str.length())- 1); i >= 0; i-- ) {
			
			revStr = revStr + str.charAt(i);
		}
		
		System.out.println("The reversed String is " +revStr);


	}

}
