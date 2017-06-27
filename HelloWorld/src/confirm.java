import java.util.Scanner;

public class confirm {
	public static void main(String[] args)
	{
		confirm confirmObject = new confirm();
		Scanner confirmUser = new Scanner(System.in);
		System.out.print("Confirm? Y/N: ");
		String confirmYN = confirmUser.nextLine();
	}
}
