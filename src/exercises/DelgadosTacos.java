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
		salesTax(priceBeforeTax);	
	}

	public static double menu()
	{
		double priceBeforeTax = 0.00;
		
		//menu pricing
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
		System.out.println(" Burrito: " + df.format(menu[0]) + "\n Street Taco: " + df.format(menu[1]) 
				+ "\n Classic Taco: " + df.format(menu[2]) + "\n Deluxe Taco: " + df.format(menu[3]) 
				+ "\n Regular Fries: " + df.format(menu[4]) + "\n Cheese Fries: " + df.format(menu[5])
				+ "\n Corn Fries: " + df.format(menu[6]) + "\n Street Corn: " + df.format(menu[7]) 
				+ "\n Pop: " + df.format(menu[8]) + "\n Water: " + df.format(menu[9]) + "\n");
		
		//ask what they would like	
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("What would you like from the menu: ");
		System.out.print("\n How many burritos: ");
		priceBeforeTax += inputDevice.nextInt()*menu[0];
		System.out.print("\n How many street tacos: ");
		priceBeforeTax += inputDevice.nextInt()*menu[1];
		System.out.print("\n How many classic tacos: ");
		priceBeforeTax += inputDevice.nextInt()*menu[2];
		System.out.print("\n How many deluxe taco: ");
		priceBeforeTax += inputDevice.nextInt()*menu[3];
		System.out.print("\n How many regular fries: ");
		priceBeforeTax += inputDevice.nextInt()*menu[4];
		System.out.print("\n How many cheese fries: ");
		priceBeforeTax += inputDevice.nextInt()*menu[5];
		System.out.print("\n How many corn fries: ");
		priceBeforeTax += inputDevice.nextInt()*menu[6];
		System.out.print("\n How many street corns: ");
		priceBeforeTax += inputDevice.nextInt()*menu[7];
		System.out.print("\n How many pop: ");
		priceBeforeTax += inputDevice.nextInt()*menu[8];
		System.out.print("\n How many water: ");
		priceBeforeTax += inputDevice.nextInt()*menu[9];
		inputDevice.close();
		
		return priceBeforeTax;
	}
	
	public static void salesTax(double price)
	{
		//calculates sales tax
		double totalPrice = 1.075 * price;
		System.out.println("\n\nThe price before tax is $" + df.format(price) + "\nAfter tax the price is $" + df.format(totalPrice));
	}
	
	public static void tacoTruck()
	{
		//attempts to display taco truck from txt file
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
