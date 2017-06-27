package univ.inu;

import java.io.*;

public class StockDataReader
{

	private String fileName = null;
	private FileReader fr = null;
	private BufferedReader br = null;
	//��ü�� ���� �̸��� �������� �ƹ��͵� ���� ����
	//���⼭�� private ���� ���� �������
	
	
	
	public void setFileName(String _fileName)
	{
		fileName = _fileName;
	}
	//������ �������� private fileName �� public _fileName �� ��������
	
	
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
	
	//br �� null ���� �ƴ��� ��� �˻��ϴ� ������ file �� �ִ��� ������  �˻��ϱ� ���ؼ�
	
	
	public String readOneLine()
	{
		try
		{
			return br.readLine();
			//������ ��� ���� ���� �о����
		}
		catch (IOException e)
		//���� ������ �����ϴ� IOException ������ ����� (�дٰ� �������� ��쿡, IO�� InputOutput)
		//��ü e�� ��� ���������� ����
		{
			e.printStackTrace();
			try
			{
				br.close();
				//������ ������ �ݾ������
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
			//fileName �� ������ false�� ������
		}
		
		try
		{
			//������ ���� fr br �� ������ new
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			//���� �ڵ���� ���� �����غ��� (������ ����)
		}
		catch (FileNotFoundException e)
		//FileNotFoundException = ������ ���� (Ŭ���� �̸�)
		//e = ������ ���� ���������� ����ִ� ��ü
		{
			e.printStackTrace();
			return false;
			//������ �̷��� ���� �� �Լ� ����
		}
		
		
		return true;
		
		
	}
	
}



//�� fileName = _fileName �� ����ϴ°���?
//=> fileName �� private���� ������༭ �ش� Ŭ���� �ȿ����� ����� �� �ֱ� ������
//public ���� �ٽ� ���� _fileName ���� �������ֱ� ���ؼ�


//import java.util.*; ���� ��쿡�� ó������ �׳� �׷��� �ϸ�ɰ��� �� ���� �̷��� �ϴ°���?