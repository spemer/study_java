package midterm;

class calc
{
	int left, right;
	int sum, avg;
	
	public void setNumbers(int left, int right)
	{
		this.left = left;
		this.right = right;
		this.sum = this.left + this.right;
		this.avg = (this.sum / 2);
	}
	
	public void printOutcomes()
	{
		System.out.printf("Sum is: %d\nAvg is: %d", this.sum, this.avg);
	}
}

public class calcTest
{
	public static void main(String[] args)
	{
		calc c1 = new calc();
		c1.setNumbers(10,20);
		c1.printOutcomes();
	}
}