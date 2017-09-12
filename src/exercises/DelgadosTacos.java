package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DelgadosTacos
{
	static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args)
	{
		tacoTruck();
		double priceBeforeTax = menu();
		
			
		
	}

	public static double menu()
	{
		double priceBeforeTax = 0.00;
		
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
		
		double[] menu = new double[]{burrito, streetTaco, classicTaco, deluxeTaco, regularFries, cheeseFries, cornFries, streetCorn,
				pop, water};
		
		
		//display menu
		System.out.println(" Burrito: " + df.format(menu[0]) + "\n Street Taco: " + menu[1] + "\n Classic Taco: " + menu[2]
				+ "\n Deluxe Taco: " + menu[3] + "\n Regular Fries: " + menu[4] + "\n Cheese Fries: " + menu[5]
				+ "\n Corn Fries: " + menu[6] + "\n Street Corn: " + menu[7] + "\n Pop: " + menu[8] + "\n Water: " + menu[9] + "\n");
		
		//ask what they would like	
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("What would you like from the menu: ");
		System.out.print("\n How many burritos: ");
		
		System.out.print("\n How many street tacos: ");
		System.out.print("\n How many classic tacos: ");
		System.out.print("\n How many deluxe taco: ");
		System.out.print("\n How many regular fries: ");
		System.out.print("\n How many cheese fries: ");
		System.out.print("\n How many corn fries: ");
		System.out.print("\n How many street corns: ");
		System.out.print("\n How many pop: ");
		System.out.print("\n How many water: ");
		inputDevice.close();
		
		return priceBeforeTax;
	}
	
	public static void salesTax(double price)
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
