//public class HelloRepeat
//{
//	public static void main (String[] args)
//	{
//		String s1 = "Hello";
//		String s2 = "";
//		// String �� Ŭ����, s1 �� s2 �� ����, ����ǥ ���� ������ ������
//		
//		s2 = s1.concat(" World!"); // concatenation
//		
//		System.out.println(s1);
//		System.out.println(s2 + "\n");
//		
//		int idx = s1.indexOf('H'); // ã���� �ϴ� ������ ��ġ ���
//		System.out.println(idx);
//		// 0���� ���ڸ� ���Ƿ� 0�� ���
//	}
//}

// import java.util.*;
// �տ� java.util. �� �ٿ��� => Scanner �տ� java.util. �� ��������

class HelloRepeat
{
	public static void main (String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		// s ��� ��ü, System.in.�� �Է�

		System.out.print("�̸��� �Է��ϼ��� : ");
		String str = s.nextLine(); // s ��� ��ü, String ���� ����
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int numb = s.nextInt(); // s ��� ��ü, int �� ����
		
		System.out.println("����� �̸��� " + str + "�̰�, ���̴� " + numb + "�� �Դϴ�.");
		System.out.printf("����� �̸��� %s�̰�, ���̴� %d�� �Դϴ�.", str, numb);
	}
}

class ifTest
{
	public static void main (String[] args)
	{
		java.util.Scanner numb = new java.util.Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int numbIn = numb.nextInt();
		
		if (numbIn >= 90)
			System.out.println(numbIn + "�� �̹Ƿ� A�Դϴ�.");
		else if (numbIn >= 80 && numbIn < 90)
			System.out.println(numbIn + "�� �̹Ƿ� B�Դϴ�.");
		else if (numbIn >= 70 && numbIn < 80)
			System.out.println(numbIn + "�� �̹Ƿ� C�Դϴ�.");
		else if (numbIn >= 60 && numbIn < 70)
			System.out.println(numbIn + "�� �̹Ƿ� D�Դϴ�.");
		else
			System.out.println(numbIn + "�� �̹Ƿ� F�Դϴ�.");
		
	}
}

// .equalsIgnoreCase �� ��ҹ��� �������
// .endsWith �� ~�� �����°� <-> .startsWith �� ~�� �����ϴ°�

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
//		do // �ϴ� ��ȣ ���� ������ �����ϰ� while
//		{
//			
//		} while (s.startsWith("Monday"));
		
		for (int i = 0; i < 10; i++)
		{
			//continue; �� ������ ���� ���ϰ� ��� �ݺ���Ŵ
			for (int j = 0; j < 10; j++)
			{
				System.out.print(i);
				break; // ***�ڱ⸦ ���ΰ� �ִ�*** ���� ����� �ݺ����� ����
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
		
		//int[] b = new int[5]; // int 5��¥�� �迭�� ����� �ڵ�
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