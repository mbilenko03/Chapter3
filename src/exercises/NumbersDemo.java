package exercises;

import java.util.Scanner;

public class NumbersDemo
{

	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in); 
		System.out.println("Please input two integers:");
		int first = inputDevice.nextInt();
		int second = inputDevice.nextInt();
		inputDevice.close();
		
		displayTwiceTheNumber(first, second);
		displayNumberPlusFive(first, second);
		displayNumberSquared(first, second);
		
	}
	
	public static void displayTwiceTheNumber(int first, int second)
	{
		System.out.println("Displaying twice the number: ");
		System.out.println(first * 2);
		System.out.println(second * 2);

	}
	
	public static void displayNumberPlusFive(int first, int second)
	{
		System.out.println("Displaying plus five the number: ");
		System.out.println(first + 5);
		System.out.println(second + 5);
	}
	
	private static void displayNumberSquared(int first, int second)
	{
		System.out.println("Displaying squared the number: ");
		System.out.println(first*first);
		System.out.println(second*second);
	}

}
