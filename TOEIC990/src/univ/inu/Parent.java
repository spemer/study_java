package univ.inu;
//univ.inu ����

public class Parent
{

	public int a;	//��δ� ���� ����
	protected int b;	//�ܺ� Ŭ�������� ������ �� ������, �ڽ�Ŭ�������� ������� �� �ִ� (��ȣ����)
	int c;	//�ܺ� Ŭ�������� ������ �� ������, �ڽĿ��Դ� ������� �� �ִ�
	private int d;	//�θ� ���� �������� �ʴ´�
	//����� ���������ڰ� ��� �ٸ�
	
	public Parent()
	{
		System.out.println("I am parent");
		
		a = 20;
		b = 30;
		c = 40;
		d = 50;
	}
	
	
	//*method overloading* (���� �̸��� �޼ҵ带 �� ��)
	//�ݵ�� �μ� ����, Ÿ���� �ٸ� ��. �Ű������� ������ �޶� ����
	//��ȯ���� ��� ����
	
	public void showSum()	//�޼ҵ�, �Ű������� ����
	{
		System.out.println("Parent showSum(); sum is " + +(a+b+c));
	}
	
	//*method overloading*
	public void showSum(int c)	//�Ű������� ����
	{
		
	}
	
	//*method overloading*
	public void showSum(int c, int d)
	{
		
	}
	
}
