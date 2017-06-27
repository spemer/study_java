import java.util.*;

public class test_170316
{
	public static void main (String args[])
	{
		Scanner inputRecord = new Scanner(System.in);

		System.out.print("Input your record: ");
		final int record = inputRecord.nextInt();
		
		if (record >= 90)
		{
			System.out.printf("Your Record is %d, Grade A", record);
		}
		else if (record >= 80 && record < 90)
		{
			System.out.printf("Your Record is %d, Grade B", record);
		}
		else if (record >= 70 && record < 80)
		{
			System.out.printf("Your Record is %d, Grade C", record);
		}
		else if (record >= 60 && record < 70)
		{
			System.out.printf("Your Record is %d, Grade D", record);
		}
		else if (record < 60)
		{
			System.out.printf("Your Record is %d, Grade F", record);
		}
	}
}

class stringTest
{
	public static void main (String[] args)
	{
		Scanner inputYourName = new Scanner(System.in);
		System.out.print("Input your name: ");
		
		String s1 = "Hello";
		String s2 = "";
		String yourName = inputYourName.nextLine();
		
		s2 = s1.concat(", world!");
		
		System.out.printf("%s \nMy name is %s.", s2, yourName);
	}
}

class switchTest
{
	public static void main (String[] args)
	{
		Scanner hakJeom = new Scanner(System.in);
		System.out.print("Input your hakjeom: ");
		
		char grade;
		int hakJeomInput = hakJeom.nextInt();
		
		switch (hakJeomInput) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.print("Your score is " + hakJeomInput + ", Grade " + grade);
	}
}