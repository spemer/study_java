package univ.inu;

public class Stock
{

	private String name = null;
	private String code = null;
	
	public Stock()
	{
		
	}
	
	
	public String showInfo()
	{
		return name + "---->" + code;
	}
	
	
	public Stock(String _name, String _code)
	//������ ������� private �� name �� code ��
	//�ٸ� Ŭ���������� ����ϱ� ���ؼ� public ���� �ٽ� ���� ���Խ�Ŵ
	{
		name = _name;
		code = _code;
	}
	
}