package show.me.the.money;
	// show.me.the.money ��� ��Ű�� �ȿ��� �����ǹǷ� ��� ����

import java.util.ArrayList;

public class roboAdvisor
{
	private ArrayList<stock> stocks = null;
		// stocks ��� �� �迭�� �������
		// private �� �پ������Ƿ�, �� Ŭ���� �ȿ����� ��� ���� (roboAdvisor)
	
	
	public roboAdvisor() // ��ȣ �ȿ� �μ��� �ƹ��͵� ���� ���� (����Ʈ)
	{
		// = ������, ��ȯ ���� ����, �̸��� Ŭ������ ����
		// Ŭ�����κ��� ��ü�� �����°� ������ (�ڵ����� ������)
	}
	
	
	// ������ = Ŭ�����κ��� ��ü�� ������
	
	public roboAdvisor(ArrayList<stock> _stocks) // ������, �μ��� ��
	{
		stocks = _stocks;
	}
	
	public void addStock(stock _s)
	{
		stocks.add(_s);
	}
	
	
	
	public void setStocks(ArrayList<stock> _stocks)
	// setStocks �� �޼ҵ�
	{
		stocks = _stocks;
	}
	
	
	
	public void showStockNamesToSell()
	// showStockNamesToSell �� �޼ҵ�
	{
		for (stock s : stocks)
		{
			if (s.isTargetMatched() == true)
			{
				System.out.println(s.name);
			}
			else
			{
				
			}
		}
	}
	
}
