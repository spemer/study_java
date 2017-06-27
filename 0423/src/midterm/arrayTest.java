package midterm;

import java.util.*;

public class arrayTest
{
	
	public static void arrTest()
	{
		//String newArray[] = {"Hello", "World", "Korea"};
		
		String newArray[] = new String[3];
		newArray[0] = "Hello";
		newArray[1] = "World";
		newArray[2] = "Korea";
		
		for (String e : newArray)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args)
	{
		arrTest();
	}
	
}
