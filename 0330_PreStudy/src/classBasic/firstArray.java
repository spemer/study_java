package classBasic;

import java.util.Scanner;

public class firstArray
{
	public static void getTotalPriceAmount(int totalAmount, int totalPrice, String ConfirmGrapeAmount)
	{
		System.out.printf("Original amount: %d\nOriginal price: %d won", totalAmount, totalPrice);
	}
	
	public static void getFruitSum(int GrapeAmount, int AppleAmount, int PeachAmount)
	{
		System.out.println("==========");
		
		if (GrapeAmount < 3)
		{
			System.out.println("You bought less than 3 grapes, so you can't get 10% discount.");
		}
		else if (GrapeAmount >= 3)
		{
			System.out.println("You bought more than 3 grapes, so you can get 10% discount.");
		}
		System.out.println("==========");
		
	}
	
	public static void main(String[] args)
	{
		final int setGrapePrice = 2000;
		final int setApplePrice = 1000;
		final int setPeachPrice = 1500;
		//
		
		//각 과일들의 갯수를 입력받는곳
		Scanner getGrapeAmount = new Scanner(System.in);
		System.out.print("Grape: ");
		int GrapeAmount = getGrapeAmount.nextInt();
		
		Scanner getAppleAmount = new Scanner(System.in);
		System.out.print("Apple: ");
		int AppleAmount = getAppleAmount.nextInt();
		
		Scanner getPeachAmount = new Scanner(System.in);
		System.out.print("Peach: ");
		int PeachAmount = getPeachAmount.nextInt();
		
		//입력받은 과일의 갯수에 따라서 가격과 총 과일의 갯수를 구해주는곳
		int totalAmount = (GrapeAmount + AppleAmount + PeachAmount);
		int totalPrice = ((GrapeAmount * setGrapePrice) + (AppleAmount * setApplePrice) + (PeachAmount * setPeachPrice));
		
		//
		Scanner getConfirmGrapeAmount = new Scanner(System.in);
		System.out.print("Want to revise amount of grape? Y/N: ");
		String ConfirmGrapeAmount = getConfirmGrapeAmount.next();
		
		//
		getFruitSum(GrapeAmount, AppleAmount, PeachAmount);
		getTotalPriceAmount(totalAmount, totalPrice, ConfirmGrapeAmount);
	}
	
}