package univ.inu;

import java.util.*;

public class Test
{
	
	public static void main (String[] argv)
	{
		
		StockDataReader sdr = new StockDataReader();
		//sdr 생성자

		sdr.setFileName("stock.txt");
		sdr.openFile();
		//파일을 열어주는 기본 내장 메소드
		
		String str = null;
		
		String c = "Code=";
		String c2 = "Company=";
		
		ArrayList<Stock> stocks = new ArrayList<Stock>();
		
		while ( (str = sdr.readOneLine()) != null)
		{	
			//System.out.println(str);
			
			//코드 추출
			int sIdx = str.indexOf("Code=");
			int eIdx = str.indexOf(",");
			
			String codeStr = str.substring(sIdx+c.length(), eIdx);
			//sIdx+c.length() => sIdx 에서 c 의 길이(length())만큼 뒤로 가겠다는 코드
			//sIdx = c.length() 길이가 같음
			
			System.out.print(codeStr + " ");
			
			//===================================================================
			
			//회사명 추출
			sIdx = str.indexOf(c2);
			String companyStr = str.substring(sIdx);
			
			System.out.println(companyStr);
			
			
			stocks.add(new Stock(companyStr, codeStr));
			
		}
		
		
//		for (int i = 0; i < 10; i++)
//		{
//			System.out.println(sdr.readOneLine());
//		}
//		한줄씩 읽어들이는데 i < 10 일때 까지만
		
		
		sdr.endReading();
		
		
		for (Stock s : stocks)
		{
			System.out.println(s.showInfo());
		}

		
	}

}


//파일 읽어들여서 출력하는것
