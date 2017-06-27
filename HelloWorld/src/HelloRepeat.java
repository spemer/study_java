//public class HelloRepeat
//{
//	public static void main (String[] args)
//	{
//		String s1 = "Hello";
//		String s2 = "";
//		// String 은 클래스, s1 과 s2 는 변수, 따옴표 안의 내용은 데이터
//		
//		s2 = s1.concat(" World!"); // concatenation
//		
//		System.out.println(s1);
//		System.out.println(s2 + "\n");
//		
//		int idx = s1.indexOf('H'); // 찾고자 하는 글자의 위치 출력
//		System.out.println(idx);
//		// 0부터 숫자를 세므로 0을 출력
//	}
//}

// import java.util.*;
// 앞에 java.util. 을 붙여줌 => Scanner 앞에 java.util. 을 생략가능

class HelloRepeat
{
	public static void main (String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		// s 라는 객체, System.in.은 입력

		System.out.print("이름을 입력하세요 : ");
		String str = s.nextLine(); // s 라는 객체, String 으로 문자
		
		System.out.print("나이를 입력하세요 : ");
		int numb = s.nextInt(); // s 라는 객체, int 로 숫자
		
		System.out.println("당신의 이름은 " + str + "이고, 나이는 " + numb + "살 입니다.");
		System.out.printf("당신의 이름은 %s이고, 나이는 %d살 입니다.", str, numb);
	}
}

class ifTest
{
	public static void main (String[] args)
	{
		java.util.Scanner numb = new java.util.Scanner(System.in);
		
		System.out.print("성적을 입력하세요: ");
		int numbIn = numb.nextInt();
		
		if (numbIn >= 90)
			System.out.println(numbIn + "점 이므로 A입니다.");
		else if (numbIn >= 80 && numbIn < 90)
			System.out.println(numbIn + "점 이므로 B입니다.");
		else if (numbIn >= 70 && numbIn < 80)
			System.out.println(numbIn + "점 이므로 C입니다.");
		else if (numbIn >= 60 && numbIn < 70)
			System.out.println(numbIn + "점 이므로 D입니다.");
		else
			System.out.println(numbIn + "점 이므로 F입니다.");
		
	}
}

// .equalsIgnoreCase 는 대소문자 상관안함
// .endsWith 는 ~로 끝나는것 <-> .startsWith 는 ~로 시작하는것

class switchTester
{
	public static void main (String[] args)
	{
		//String str = "Monday";
		
//		while (s.endsWith("Monday"))
//		{
//			
//		}
//		
//		do // 일단 괄호 안의 내용을 실행하고 while
//		{
//			
//		} while (s.startsWith("Monday"));
		
		for (int i = 0; i < 10; i++)
		{
			//continue; 는 다음을 실행 안하고 계속 반복시킴
			for (int j = 0; j < 10; j++)
			{
				System.out.print(i);
				break; // ***자기를 감싸고 있는*** 가장 가까운 반복문을 끝냄
			}
			//break;
		}
	}
}

class arrayTest
{
	public static void main (String[] args)
	{
		//int[] a;
//		a = new int[5];
//
//		a[0] = 4;
//		a[1] = 5;
		
		//int[] b = new int[5]; // int 5개짜리 배열을 만드는 코드
		//int c[] = new int[5];
		int[] d = {1, 2, 3, 4, 5};
		
		System.out.println(d[3]);
		
		for (int i = 0; i < d.length; i++)
		{
			for (int j = 0; j < d.length; j++)
			{
				System.out.print(d[i]);
			}
		}
		
//		for (int v : d)
//		{
//			System.out.print(v);
//		}
	}
}