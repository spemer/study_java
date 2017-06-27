package remind_robo;

import java.util.Scanner;

public class allRemind
{
	public static void main (String[] args)
	{
		
		System.out.println("Make 15 with any numbers");

		Scanner getNumber1 = new Scanner(System.in);
		System.out.print("Input any number: ");
		int numb1 = getNumber1.nextInt();

		Scanner getNumber2 = new Scanner(System.in);
		System.out.print("Input any number: ");
		int numb2 = getNumber2.nextInt();

		Scanner getNumber3 = new Scanner(System.in);
		System.out.print("Input any number: ");
		int numb3 = getNumber3.nextInt();
		
		int userAnswer = numb1 + numb2 + numb3;
		
		System.out.println("Your answer is: " + userAnswer + "\n");
		
		if (userAnswer == 15)
		{
			System.out.println("Correct answer");
		}
		else if (userAnswer < 15)
		{
			System.out.println("The answer is bigger than " + userAnswer);
		}
		else if (userAnswer > 15)
		{
			System.out.println("The answer is smaller than " + userAnswer);
		}
		
		System.out.println("==========");
		
		int[] s = new int[5];
		
		for(int i = 0; i < s.length; i++)
		{
			s[i] = i;
		}
		
		for(int i = 0; i < s.length; i++)
		{
			System.out.print(s[i]);
		}
		
	}
}