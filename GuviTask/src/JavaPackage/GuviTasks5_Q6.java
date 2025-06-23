package JavaPackage;
import java.util.Scanner;

public class GuviTasks5_Q6 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int month, daysStayed;
		float rent = 1500f;
		
		System.out.println("Enter month");
		month = obj.nextInt();
		
		System.out.println("Enter number of days");
		daysStayed = obj.nextInt();
		
		switch(month) {
		
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
			rent = rent * daysStayed;
			System.out.println("Your rent: " +rent);
			break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			rent = rent * daysStayed;
			float peakRent = rent + (0.2f * rent);
			System.out.println("Your rent: " +peakRent);
			break;
	    default:
	    	System.out.println("Enter a valid month");
				
		}

	}

}
