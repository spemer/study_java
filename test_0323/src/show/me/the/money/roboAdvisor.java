package show.me.the.money;
	// show.me.the.money 라는 패키지 안에서 생성되므로 계속 붙음

import java.util.ArrayList;

public class roboAdvisor
{
	private ArrayList<stock> stocks = null;
		// stocks 라는 빈 배열을 만들어줌
		// private 가 붙어있으므로, 이 클래스 안에서만 사용 가능 (roboAdvisor)
	
	
	public roboAdvisor() // 괄호 안에 인수를 아무것도 받지 않음 (디폴트)
	{
		// = 생성자, 반환 형이 없고, 이름은 클래스와 같음
		// 클래스로부터 객체를 만들어내는게 생성자 (자동으로 생성됨)
	}
	
	
	// 생성자 = 클래스로부터 객체를 만들어옴
	
	public roboAdvisor(ArrayList<stock> _stocks) // 생성자, 인수가 들어감
	{
		stocks = _stocks;
	}
	
	public void addStock(stock _s)
	{
		stocks.add(_s);
	}
	
	
	
	public void setStocks(ArrayList<stock> _stocks)
	// setStocks 는 메소드
	{
		stocks = _stocks;
	}
	
	
	
	public void showStockNamesToSell()
	// showStockNamesToSell 는 메소드
	{
		for (stock s : stocks)
		{
			if (s.isTargetMatched() == true)
			{
				System.out.println(s.name);
			}
			else
			{
				
			}
		}
	}
	
}
