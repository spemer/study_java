package midterm;

public class methodDemo2
{
	
	public static String numbering(int i)
	{
		
		if (i == 1)
		{
			return "one";
		}
		else if (i == 2)
		{
			return "two";
		}
		else if (i == 3)
		{
			return "three";
		}
		
		return "none";
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(numbering(1));
		System.out.println(numbering(2));
		System.out.println(numbering(3));
		System.out.println(numbering(4));
	}

}
