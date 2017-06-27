package self0328;

import java.util.*;

public class MathTestNumb
{
	
	public static void main(String[] args)
	{

		Scanner get_x = new Scanner(System.in);
		System.out.print("x: ");
		int _x = get_x.nextInt();

		Scanner get_y = new Scanner(System.in);
		System.out.print("y: ");
		int _y = get_y.nextInt();

		Scanner get_howTo = new Scanner(System.in);
		System.out.print("How to? : ");
		String _howTo = get_howTo.nextLine();
		
		
		int sum;
		MathTest numbers = new MathTest();
		
		
		if (_howTo.contains("+"))
		{
		sum = numbers.add(_x,_y);
		System.out.printf("%d %s %d = %d", _x, _howTo, _y, sum);
		}
		else if (_howTo.contains("-"))
		{
		sum = numbers.minus(_x,_y);
		System.out.printf("%d %s %d = %d", _x, _howTo, _y, sum);
		}
		
	}

}
