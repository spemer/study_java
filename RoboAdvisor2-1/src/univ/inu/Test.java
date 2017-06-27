package univ.inu;

import java.util.*;

public class Test 
{
	public static void main(String[] argv)
	{
		StockDataReader sdr = new StockDataReader();

		sdr.setFileName("stock.txt");
		sdr.openFile();
		
		String str = null;
		
		String c = "Code=";
		String c2 = "Company=";
		
		ArrayList<Stock> stocks = new ArrayList<Stock>();
		
		while ( (str = sdr.readOneLine()) != null)
		{	
			// 코드 추출
			int sIdx = str.indexOf(c);
			int eIdx = str.indexOf(",");
			String codeStr = str.substring(sIdx+c.length(), eIdx);
			
			System.out.print(codeStr + "    ");
			
			sIdx = str.indexOf(c2);
			String companyStr = str.substring(sIdx+c2.length());
			
			System.out.println(companyStr);
			
			stocks.add(new Stock(companyStr, codeStr));
		}
		sdr.endReading();
		
		for (Stock s : stocks)
		{
			System.out.println(s.showInfo());
		}
	}
}