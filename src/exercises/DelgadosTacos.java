package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DelgadosTacos
{

	public static void main(String[] args)
	{
		tacoTruck();
	}

	public static void menu()
	{

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
