package classBasic;

import java.util.*;

public class plusMinusTest
{
	
	public static void getCalc(int First, String HowTo, int Second, int TOTAL)
	{
		
		int getSum = First + Second;
		int getMinus = First - Second;
		int getMulti = First * Second;
		int getDiv = First / Second;
		
		if (HowTo.contains("+"))
		{
			TOTAL = getSum;
		}
		else if (HowTo.contains("-"))
		{
			TOTAL = getMinus;
		}
		else if (HowTo.contains("*"))
		{
			TOTAL = getMulti;
		}
		else if (HowTo.contains("/"))
		{
			TOTAL = getDiv;
		}
		
		System.out.printf("%d %s %d = %d", First, HowTo, Second, TOTAL);
		
	}
	
	public static void main(String[] args)
	{
		Scanner getFirstNumb = new Scanner(System.in);
		System.out.print("Input first number: ");
		int First = getFirstNumb.nextInt();
		
		Scanner getHowTo = new Scanner(System.in);
		System.out.print("Input how to: ");
		String HowTo = getHowTo.nextLine();
		
		Scanner getSecondNumb = new Scanner(System.in);
		System.out.print("Input second number: ");
		int Second = getSecondNumb.nextInt();
		
		int TOTAL = 0;
		
		getCalc(First, HowTo, Second, TOTAL);
		
	
	}
	
}