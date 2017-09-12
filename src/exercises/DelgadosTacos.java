package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DelgadosTacos
{

	public static void main(String[] args)
	{
		tacoTruck();
		menu();
		
			
		
		DecimalFormat df = new DecimalFormat("0.00");
	}

	public static void menu()
	{
		double burrito = 9.00;
		double streetTaco = 6.50;
		double classicTaco = 5.95;
		double deluxeTaco = 9.99;
		double regularFries = 1.20;
		double cheeseFries = 3.10;
		double cornFries = 6.25;
		double streetCorn = 3.00;
		double pop = 2.50;
		double water = 2.25;
		
		//display menu
		System.out.println(" Burrito: " + burrito + "\n Street Taco: " + streetTaco + "\n Classic Taco: " + classicTaco
				+ "\n Deluxe Taco: " + deluxeTaco + "\n Regular Fries: " + regularFries + "\n Cheese Fries: " + cheeseFries
				+ "\n Corn Fries: " + cornFries + "\n Street Corn: " + streetCorn + "\n Pop: " + pop + "\n Water: " + water + "\n");
		
		//ask what they would like
		System.out.println("What would you like from the menu: ");
		
	}
	
	public static void salesTax()
	{

	}
	
	public static void tacoTruck()
	{
		
		try
		{
			Scanner input = new Scanner(new File("truck.txt"));
			
			while (input.hasNextLine()) 
			{
				System.out.println(input.nextLine());
			}
			
			input.close();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("No Truck Found :(");
		}
		
	}
}
