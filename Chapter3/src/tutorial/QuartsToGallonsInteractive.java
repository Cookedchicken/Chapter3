package tutorial;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int quartsNeeded;
		int gallonsNeeded;
		int quartsRemaining;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter quarts Needed>>>");
		quartsNeeded = input.nextInt();
		
		gallonsNeeded = quartsNeeded/4;
		quartsRemaining = quartsNeeded % 4;
		
		
		System.out.println("Quarts remaining = 1");
		
		
		
		
		
		
		

	}

}
