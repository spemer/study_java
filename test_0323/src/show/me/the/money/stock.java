package show.me.the.money;
	// ��Ű���� full name�� show.me.the.money.stock
	// �̰��� Ʋ (������ ������� ����� ���� Ʋ)

public class stock
//Ǯ���� = show.me.the.money.stock (��Ű�� + Ŭ������)
{
// �̰��� �����(��ü)�� ���� Ʋ (Ŭ����)
	public String name = ""; // ���� ���� - �ʱ�ȭ
		// private String name = ""; ���� �ϸ�,
		// �� Ŭ���� �������� Ȱ�� ����. (test.java)���� ��� �Ұ���
		// private �� ���� ������ ���ȶ���.
	public int buy_price = 0;
	public int cur_price = 0;
	public double target = 0.0; // ��ǥ ���ͷ�


	//////////////////////////////////////////////////////////


	public boolean isTargetMatched() // = �޼ҵ�
		// public = ������, ������ ��� ������, Ŭ���� �ۿ��� ȣ�� ���� (���� �ڹ� ������Ʈ �ȿ���)(��������ó��)
		// public �� �ݴ�� private����, Ŭ���� �������� ȣ�� ���� (��������������)
	{
		if (buy_price * (1.0 + target) < cur_price)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}