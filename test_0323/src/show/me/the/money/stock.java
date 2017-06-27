package show.me.the.money;
	// 패키지의 full name은 show.me.the.money.stock
	// 이곳은 틀 (조립할 레고블럭을 만들기 위한 틀)

public class stock
//풀네임 = show.me.the.money.stock (패키지 + 클래스명)
{
// 이것은 레고블럭(객체)을 만들 틀 (클래스)
	public String name = ""; // 값이 없음 - 초기화
		// private String name = ""; 으로 하면,
		// 이 클래스 내에서만 활용 가능. (test.java)에서 사용 불가능
		// private 을 쓰는 이유는 보안때문.
	public int buy_price = 0;
	public int cur_price = 0;
	public double target = 0.0; // 목표 수익률


	//////////////////////////////////////////////////////////


	public boolean isTargetMatched() // = 메소드
		// public = 공공의, 공용의 라는 뜻으로, 클래스 밖에서 호출 가능 (같은 자바 프로젝트 안에서)(전역변수처럼)
		// public 의 반대는 private으로, 클래스 내에서만 호출 가능 (지역변수같은것)
	{
		if (buy_price * (1.0 + target) < cur_price)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}