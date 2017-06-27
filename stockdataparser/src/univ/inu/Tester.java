package univ.inu;

import java.util.*;

public class Tester 
{

	public static void main(String[] args) 
	{
		
		ArrayList<StockInfo> stocks = new ArrayList<StockInfo>();
		StockDataLoader sdl = new StockDataLoader("stockToBuy.txt", stocks);
		sdl.startWork();
		
		for (StockInfo i: stocks)
		{
			i.showData();
		}
		
/*		
		StockDayPrice sdp1 = new StockDayPrice("2017-04-06",
				10.0, 10.0, 10.0, 10.0, 10.0, 300);
		StockDayPrice sdp2 = new StockDayPrice("2017-04-07",
				10.0, 10.0, 10.0, 10.0, 10.0, 300);
		
		StockInfo si = new StockInfo("»ï¼ºÀüÀÚ");
		si.addDayPrice(sdp1);
		si.addDayPrice(sdp2);
		
		si.showData();
*/		
	}

}
