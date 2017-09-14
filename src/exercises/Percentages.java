package exercises;

import java.util.Scanner;

public class Percentages
{

	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in); 
		System.out.println("Please input two numbers:");
		double first = inputDevice.nextDouble();
		double second = inputDevice.nextDouble();
		inputDevice.close();
		
		computePercent(first, second);
		computePercent(second, first);
	}

	public static void computePercent(double first, double second)
	{
		System.out.println(first + " is " +(first/second)*100 + "% of " + second);
	}

}
