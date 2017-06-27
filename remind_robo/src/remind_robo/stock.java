package remind_robo;

public class stock
{

	public String name = "";
	public int buyPrice = 0;
	public int curPrice = 0;
	public double tarPrice = 0;


	public boolean isTargetMatched()
	{
		if (buyPrice * (1.0 + tarPrice) < curPrice)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
