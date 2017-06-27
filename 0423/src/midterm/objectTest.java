package midterm;

import java.util.*;

public class objectTest {

	public static void getSum(int right, int left)
	{
		int _sum = right + left;
		
		System.out.printf("\nSum: %d", _sum);
	}
	
	public static void getAvg(int right, int left)
	{
		int _avg = (right + left) / 2;
		
		System.out.printf("\nAvg: %d", _avg);
	}
	
	public static void main(String[] args)
	{
		Scanner getRight = new Scanner(System.in);
		System.out.print("Right: ");
		int _right = getRight.nextInt();

		Scanner getLeft = new Scanner(System.in);
		System.out.print("Left: ");
		int _left = getLeft.nextInt();
		
		getSum(_right, _left);
		getAvg(_right, _left);
		
		getRight.close();
		getLeft.close();
	}

}
