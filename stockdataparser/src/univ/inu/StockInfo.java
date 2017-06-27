package univ.inu;

import java.util.*;

public class StockInfo 
{
	String stockName = null;
	ArrayList<StockDayPrice> dayPrices = null;
	
	public StockInfo()
	{
		dayPrices = new ArrayList<StockDayPrice>();
	}
	
	public StockInfo(String _name)
	{
		this();
		stockName = _name;
	}
	
	public void showData()
	{
		System.out.println(stockName);
		for (StockDayPrice i : dayPrices)
		{
			i.showData();
		}
	}
	
	public void addDayPrice(StockDayPrice _sdp)
	{
		dayPrices.add(_sdp);
	}
	
	
}
















