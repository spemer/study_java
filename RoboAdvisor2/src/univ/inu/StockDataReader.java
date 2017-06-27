package univ.inu;

import java.io.*;

public class StockDataReader
{

	private String fileName = null;
	private FileReader fr = null;
	private BufferedReader br = null;
	//객체에 대한 이름만 만들어놓고 아무것도 하지 않음
	//여기서도 private 으로 먼저 만들어줌
	
	
	
	public void setFileName(String _fileName)
	{
		fileName = _fileName;
	}
	//위에서 만들어놓은 private fileName 을 public _fileName 에 대입해줌
	
	
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
	
	//br 이 null 인지 아닌지 계속 검사하는 이유는 file 이 있는지 없는지  검사하기 위해서
	
	
	public String readOneLine()
	{
		try
		{
			return br.readLine();
			//파일을 열어서 한줄 한줄 읽어들임
		}
		catch (IOException e)
		//위의 파일을 실행하다 IOException 오류가 생기면 (읽다가 실패했을 경우에, IO는 InputOutput)
		//객체 e에 담긴 세부정보로 실행
		{
			e.printStackTrace();
			try
			{
				br.close();
				//열었던 파일은 닫아줘야함
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
			//fileName 이 없으면 false로 내보냄
		}
		
		try
		{
			//위에서 만든 fr br 에 생성자 new
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			//위의 코드들을 먼저 실행해보고 (파일이 열림)
		}
		catch (FileNotFoundException e)
		//FileNotFoundException = 오류의 종류 (클래스 이름)
		//e = 오류에 대한 세부정보를 담고있는 객체
		{
			e.printStackTrace();
			return false;
			//없으면 이렇게 실행 후 함수 종료
		}
		
		
		return true;
		
		
	}
	
}



//왜 fileName = _fileName 을 사용하는거지?
//=> fileName 은 private으로 만들어줘서 해당 클래스 안에서만 사용할 수 있기 때문에
//public 으로 다시 만들어서 _fileName 으로 대입해주기 위해서


//import java.util.*; 같은 경우에서 처음부터 그냥 그렇게 하면될것을 왜 굳이 이렇게 하는거지?