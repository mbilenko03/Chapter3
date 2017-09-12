package exercises;

import java.util.Scanner;

public class DemoRaise
{
	//Page 132
	
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Input Salary: ");
		double salary = inputDevice.nextDouble();
		
		System.out.print("Input Starting Wage: ");
		double startingWage = inputDevice.nextDouble();
		
		inputDevice.close();
		
		System.out.println("Here is your raise: ");

		predictRaise(salary);
		predictRaise(startingWage);
		
	}
	
	public static void predictRaise(double salary)
	{
		double newSalary;
		final double Raise_Rate = 1.10;
		newSalary = salary * Raise_Rate;
		System.out.println("Current salary: " + salary + "     After raise: " + newSalary);
	}

}
