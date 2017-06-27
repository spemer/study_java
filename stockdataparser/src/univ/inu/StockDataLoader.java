package univ.inu;

import java.util.*;
import java.io.*;

public class StockDataLoader 
{
	String fname = null;
	ArrayList <StockInfo> stocks = null;

	public StockDataLoader()
	{
		
	}
	
	public StockDataLoader(String _fname, ArrayList<StockInfo> _stocks)
	{
		fname = _fname;
		stocks = _stocks;
	}
	
	public void startWork()
	{
		if (fname == null || stocks == null)
		{
			return;
		}
		
		try
		{
			FileReader fr = new FileReader(fname);
			BufferedReader br = new BufferedReader(fr);
			
			String str = null;
			StockInfo si = null;
			while ( (str = br.readLine()) != null)
			{
				if (str.startsWith("----") == true)
				{
					if (si != null)
					{
						stocks.add(si);
					}
					String _sname = str.substring( "-------------".length(), str.indexOf('M')-1);
					si = new StockInfo(_sname);
				}
				else if (str.startsWith("   ") == true || str.startsWith("Date") == true)
				{
					continue;
				}
				else
				{
					StringTokenizer st = new StringTokenizer(str);
					String _d = st.nextToken();  // date
					double _o = (new Double(st.nextToken())).doubleValue();
					double _h = (new Double(st.nextToken())).doubleValue();
					double _l = (new Double(st.nextToken())).doubleValue();
					double _c = (new Double(st.nextToken())).doubleValue();
					long _v= (new Long(st.nextToken())).longValue();
					double _ac = (new Double(st.nextToken())).doubleValue();
					
					StockDayPrice sdp = new StockDayPrice(_d, _o, _h, _l, _c, _v, _ac);
					si.addDayPrice(sdp);
					
				}
			} // end of while
			stocks.add(si);
			
			
			br.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}





















