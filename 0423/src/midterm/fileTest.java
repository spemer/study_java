package midterm;

import java.util.*;
import java.io.*;

public class fileTest
{
	public static void main(String[] args)
	{
		try
		{
			File fl = new File("intTest.txt");
			Scanner _fl = new Scanner(fl);
			while(_fl.hasNextInt())
			{
				System.out.print(_fl.nextInt() * 1000);
			}
			_fl.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}