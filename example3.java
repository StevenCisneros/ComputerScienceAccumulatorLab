package test;

import java.util.Scanner;

public class example3 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number to add 10 times: ");
		double d = s.nextDouble();
		double accumulator = 0;
		
		for (int i = 0; i < 10; i++)
		{
			accumulator += d;
			System.out.printf("%8.2f\n", accumulator);
		}
		

	}

}
