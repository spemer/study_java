public class intTest // Ŭ���� intTest �� ���۵Ǵ� ����
{
	public static void main (String args[]) // �޼ҵ� main �� ���۵Ǵ� ����
	// (String[] args) �� (String args[]) �� ���� �������� �����ϱ�
	{
		final char k = '��'; // k �� '��'��� �ʱⰪ�� ����
		boolean bln_value;
		
		bln_value = true;
		bln_value = ( 3 < 1 );
		
		System.out.println("K = " + k); // ���
		System.out.println("3 < 1 = " + bln_value);
	}
}

class cerealName
{
	public static void main (String args[])
	{
		final char Ka = '��';
		boolean bln_calc;
		
		bln_calc = ( 2 < 5 );
		System.out.println(Ka);
		System.out.println(bln_calc);
	}
}

// *** public �� ���� Ŭ������ �׻� [.java] ���ϰ� �̸��� ��ġ�ؾ� �Ѵ� (������ ȣ�� ����) ***
// static = ���� �޼ҵ�
// void = ������� ��ȯ���� ����
// main = �޼ҵ��� �̸�

class light
{
	public static void main (String[] args)
	{
		long lightSpeed, distance; // ���� ����
		
		lightSpeed = 300000; // ������ �� ����
		distance = lightSpeed * 365L * 24 * 60 * 60;
		
		System.out.println("It moves " + distance + " km per one year");
	}
}

class lightSpeedCalTime
{
	public static void main (String[] args)
	{
		final double lightSpeed = 30e4;
		double distance = 40e12;
		
		double secs;
		
		secs = distance/lightSpeed;
		
		double lightYear = secs/(60.0*60.0*24.0*365.0);
		System.out.println("It takes " + lightYear +" Light Years.");
	}
}

class intTest2 // �ι�° class �� �����ϱ� ���ؼ��� public �� ����� �Ѵ�
{
	public static void main (String[] args)
	{
		System.out.println("Obama"); // �ܼ� string ���
	}
}