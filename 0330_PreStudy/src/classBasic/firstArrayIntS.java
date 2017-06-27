package classBasic;

import java.util.*;

public class firstArrayIntS
{
	
	public static void main(String[] args)
	{
		int total = 0;
		
		Scanner getStudentNumb = new Scanner(System.in);
		System.out.print("Number of students: ");
		int studentNumb = getStudentNumb.nextInt();
		//값 입력 및 대입
		
		int[] _studentNumb = new int[studentNumb];
		//입력된 값 크기만큼의 배열을 생성
		
		
		Scanner getScore = new Scanner(System.in);
		
		int[] _score = new int[studentNumb];
		
		
		if (studentNumb != 0)
		{
			for (int i = 0; i < _studentNumb.length; i++)
			{
				System.out.print("Student number: " + (i + 1) + ", Score: ");
				_score[i] = getScore.nextInt();
			}

			for (int i = 0; i < _studentNumb.length; i++)
			{
				total = total + _score[i];
			}
			
			int average = total / studentNumb;
			
			System.out.printf("Average is %d", average);
		}
		else
		{
			System.out.print("Wrong Value");
		}
		
		
		
	}
	
}