import java.util.Scanner;

public class purchaseTest
{
	public static void main(String[] args)
	{
		Scanner getName = new Scanner(System.in);
		System.out.print("Type your name: ");
		String nameView = getName.nextLine();
		
		Scanner getPrdt = new Scanner(System.in);
		System.out.print("Type your product: ");
		String prdtView = getPrdt.nextLine();
		
		Scanner getPrice = new Scanner(System.in);
		System.out.print("Price: ");
		int priceView = getPrice.nextInt();
		
		System.out.println("==========");
		System.out.printf("Name: %s\nProduct: %s\nPrice: %d\n", nameView, prdtView, priceView);
		System.out.println("==========");
		
		Scanner confirmUser = new Scanner(System.in);
		System.out.print("Confirm? Y/N: ");
		String confirmYN = confirmUser.nextLine();
		
		switch (confirmYN)
		{
		case "y":
		case "Y":
			System.out.println("Confirmed");
			break;
		case "n":
		case "N":
			System.out.println("Denied");
			break;
		
		}
		
	}
}