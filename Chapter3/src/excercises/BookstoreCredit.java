package excercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double gpa;
		String name;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter name");
		name = input.nextLine();
		System.out.println("Enter gpa");
		gpa = input.nextInt();
		
		displaycredit(name, gpa);
		
	}
	public static void displaycredit (String name, double gpa) {
		double credit;
		
		credit = gpa * 10;
		
		System.out.println("Your name is  " + name + "Your credit is" + credit);  
		
		
	}
}
