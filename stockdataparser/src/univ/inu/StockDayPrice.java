package univ.inu;

public class StockDayPrice 
{
	String priceDate = null;
	double openPrice = 0.0;
	double closePrice = 0.0;
	double highPrice = 0.0;
	double lowPrice = 0.0;
	double acPrice = 0.0;
	long volume = 0;
	
	public StockDayPrice()
	{
		
	}
	
	public StockDayPrice(String _p, double _o,
			double _h, double _l, double _c, long _v, double _ac)
	{
		priceDate = _p;
		openPrice = _o;
		closePrice = _c;
		highPrice = _h;
		lowPrice = _l;
		acPrice = _ac;
		volume = _v;
		
	}
	public void showData()
	{
		System.out.printf("%s %.2f %.2f %d\n", 
				priceDate, openPrice, closePrice, volume);
	}
}
























