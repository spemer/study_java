package midterm;

import java.util.*;

public class mainTest
{
	public static void main (String[] args)
	{

		Scanner scnr = new Scanner(System.in);
		System.out.println("Number: ");
		
		while(scnr.hasNextInt())
		{
			System.out.println(scnr.nextInt() * 1000);
		}
		
		scnr.close();
		
	}
}
