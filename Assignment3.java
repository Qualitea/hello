/*
Author: Jonathan Dwyer
Filename: Assignment3.java
Specification: Find the GCD of two integers
For: CSE-110
Time spent: 60 minutes
*/


/*

Part 1

A. 10 9 8 7 6 5 4 3 2
B. 5 15


Part 2

import java.util.Scanner;

public class part2
{
	public static void main(String [] args)
	{

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String str = scan.nextLine();


		for (int i = str.length()-1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}

	}
}


*/

import java.util.Scanner; //importing scanner class

public class Assignment3
{
	public static void main(String [] args)
	{
		//creating scanner object
		Scanner scan = new Scanner(System.in);

		//user prompt and getting user input
		System.out.print("Please enter two integers to find the GCD of: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		//declaring variables
		int largeint;
		int smallint;

		//initializing variables to num1 num2
		if (num1 > num2)
		{
			largeint = num1;
			smallint = num2;
		}
		else
		{
			largeint = num2;
			smallint = num1;
		}


		//loop to find gcd
		while ( largeint != smallint)
		{
			if (largeint>smallint)
			{
				largeint = largeint - smallint;
			}
			else
			{
				smallint = smallint - largeint;
			}
		}

		//display for user
		System.out.println("The GCD of " + num1 + " and " + num2 + " is " + largeint);

	} //end main

}//end class


