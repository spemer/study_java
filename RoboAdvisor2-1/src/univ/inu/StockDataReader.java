package univ.inu;

import java.io.*;

public class StockDataReader 
{

	private String fileName = null;
	private FileReader fr = null;
	private BufferedReader br = null;
	
	public void setFileName(String _fileName)
	{
		fileName = _fileName;
	}
	
	public void endReading()
	{
		if (br != null)
		{
			try 
			{
				br.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public String readOneLine()
	{
		if (br == null)
		{
			return null;
			
		}
		try 
		{
			return br.readLine();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			try 
			{
				br.close();
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
				return null;
			}
			return null;
		}
	}
	
	public boolean openFile()
	{
		if (fileName == null)
		{
			return false;
		}
		
		try 
		{
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			return false;
		}
		
		
		return true;
	}
	
}