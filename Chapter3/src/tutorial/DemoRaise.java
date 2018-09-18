package tutorial;

public class DemoRaise {

	public static void main(String[] args) 
	{
	
	double salary = 200.00;
	double startingWage = 800.00;
	System.out.println("Demonstrating some raises");
	Scanner input = new Scanner (System.in);
	System.out.println("Enter your salary >> ");
	salary = input.nextDouble();
	
	predictRaise(salary);
	
	

	}
	public static void predictRaise(double salary)
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary:" "+ "
				+ "salary + " 	After raise: "+"
					newSalary);
	}

}
