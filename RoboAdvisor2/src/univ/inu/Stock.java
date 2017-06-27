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
	//위에서 만들어진 private 인 name 과 code 를
	//다른 클래스에서도 사용하기 위해서 public 에서 다시 만들어서 대입시킴
	{
		name = _name;
		code = _code;
	}
	
}
