package univ.inu;

public class Child extends Parent	//Ŭ���� Parent �� ���
{
	
	public Child()
	{
		a = 10;	//�θ�κ��� ��, ��� ���� (public)
		b = 100;	//��� ���� (protected)
		c = 400;	//��� ���� (defalut ����������)
		//d = 50;	//�θ𿡰Դ� ������ ��� �Ұ��� (private)
		
		
		System.out.println("I am Child");
	}

	public void showChild()
	{
		this.showSum(); //�ڱ� �ڽ� Ŭ������ showSum
		super.showSum(); //�θ��� showSum
		System.out.println("this child");
	}
	//***this. => �ڱ� �ڽ� Ŭ����
	//***super. => �θ��� Ŭ����
	
	
	//method overriding
	//�θ� �ִ� �޼ҵ尡 �Ҹ��°� �ƴ϶�, �ڽĿ� �ִ� �޼ҵ尡 �Ҹ� (showSum)
	//�ڽĿ� �ִ� showSum()
	public void showSum()
	{
		System.out.println("Child showSum();");
	}
	
}
