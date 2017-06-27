package midterm;

import java.util.*;

public class methodDemo1
{
	public static String getStr(int i, int j)
	{
		String output = ""; //문자열 변수 output 정의
		
		while (i < j)
		{
			output += i;
			i++;
			
			if (i == 10)
			{
				break;
			}
		}
		
		return output;
	}
	
	public static void main(String[] args)
	{
		Scanner getJ = new Scanner(System.in);
		System.out.print("Input J: ");
		int j = getJ.nextInt();
		getJ.close();
		
		String _output = getStr(0,j);
		System.out.print(_output);
	}
}