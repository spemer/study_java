package midterm;

import java.util.*;

class thisCalc
{
	int left, right, sum, avg;
	
	public void getNumbers(int left, int right)
	{
		this.left = left;
		this.right = right;
		this.sum = left + right;
		this.avg = this.sum / 2;
	}
	
	public int sum()
	{
		int _sum = this.sum;
		return _sum;
	}
	
	public int avg()
	{
		int _avg = this.avg;
		return _avg;
	}
}

public class memberTest
{
	public static void main(String[] args)
	{
		Scanner getLeft = new Scanner(System.in);
		System.out.print("Left: ");
		int _left = getLeft.nextInt();
		
		Scanner getRight = new Scanner(System.in);
		System.out.print("Right: ");
		int _right = getRight.nextInt();
		
		thisCalc cl = new thisCalc();
		cl.getNumbers(_left, _right);
		
		System.out.printf("%d + %d = %d\nSum is %d", _left, _right,  cl.sum, cl.avg);
		
		getLeft.close();
		getRight.close();
	}
}