package excercises;

import java.util.Scanner;

public class MetricConversion 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
  		Scanner input = new Scanner(System.in);
		int centimeters;
		int liters;
		System.out.println("Please enter a number for inches >>");
		centimeters = input.nextInt();
		System.out.println("Please enter a number for Gallons >>");
		liters = input.nextInt();
		
		metricConversion(centimeters, liters);
	} 
	public static void metricConversion(int inches, int gallons){
			//x will be centimeters
			//y liters
		double centConversion;
		double litersConversion;
		
		centConversion = inches * 2.54;
		litersConversion = gallons * 3.7854; 
		System.out.println("The total number is >>");
				
		
	} 
		
		
		
}
