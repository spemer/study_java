import java.util.*;

public class rewind0316
{
	public static void main (String[] args)
	{
		Scanner inputName = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = inputName.nextLine();

		Scanner inputType = new Scanner(System.in);
		System.out.print("Product: ");
		String type = inputType.nextLine();

		Scanner inputPrice = new Scanner(System.in);
		System.out.print("Price: ");
		int price = inputPrice.nextInt();

		System.out.print("=====\n");

		System.out.printf("Name: %s \nProduct: %s \nPrice: %d Won\n", name, type, price);

		System.out.print("=====\n");

		Scanner confirm = new Scanner(System.in);
		System.out.print("Confirm? Y or N: ");
		String confirmInfo = confirm.nextLine();

		if (confirmInfo.equalsIgnoreCase("Y"))
		{
			System.out.print("Confirmed");
		}
		else if (confirmInfo.equalsIgnoreCase("N"))
		{
			System.out.print("Denied");
		}
		else
		{
			System.out.print("Type only 'Y' or 'n'");
		}
	}
}