package univ.inu;

import java.util.*;

public class Test
{
	
	public static void main (String[] argv)
	{
		
		StockDataReader sdr = new StockDataReader();
		//sdr ������

		sdr.setFileName("stock.txt");
		sdr.openFile();
		//������ �����ִ� �⺻ ���� �޼ҵ�
		
		String str = null;
		
		String c = "Code=";
		String c2 = "Company=";
		
		ArrayList<Stock> stocks = new ArrayList<Stock>();
		
		while ( (str = sdr.readOneLine()) != null)
		{	
			//System.out.println(str);
			
			//�ڵ� ����
			int sIdx = str.indexOf("Code=");
			int eIdx = str.indexOf(",");
			
			String codeStr = str.substring(sIdx+c.length(), eIdx);
			//sIdx+c.length() => sIdx ���� c �� ����(length())��ŭ �ڷ� ���ڴٴ� �ڵ�
			//sIdx = c.length() ���̰� ����
			
			System.out.print(codeStr + " ");
			
			//===================================================================
			
			//ȸ��� ����
			sIdx = str.indexOf(c2);
			String companyStr = str.substring(sIdx);
			
			System.out.println(companyStr);
			
			
			stocks.add(new Stock(companyStr, codeStr));
			
		}
		
		
//		for (int i = 0; i < 10; i++)
//		{
//			System.out.println(sdr.readOneLine());
//		}
//		���پ� �о���̴µ� i < 10 �϶� ������
		
		
		sdr.endReading();
		
		
		for (Stock s : stocks)
		{
			System.out.println(s.showInfo());
		}

		
	}

}


//���� �о�鿩�� ����ϴ°�
