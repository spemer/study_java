package show.me.the.money;
// 패키지는 성과 같은 역할(풀네임)

import java.util.ArrayList;
//import show.me.the.money.*;
//쇼미더머니 라는 패키지.클래스로 통일해서 사용

public class test
{

	public static void main(String[] args)
	{
		stock s1 = null, s2 = null, s3 = null;
			// 값은 없음. 이름만 만들어진 상태 (초기화가 되지 않은 상태)
			// null = 이름만 있을 뿐이지, 가리키는 값은 없음.

		s1 = new stock();
		s2 = new stock();
		s3 = new stock();
			// 객체 들을 3개 만들어줌 (레고블럭들)

			// stock.java 에서 만들어진 ***틀*** 에 따라 위에서 만든 객체에 값(데이터)을 설정해줌
		s1.name = "Samsung";
		s1.buy_price = 300000;
		s1.cur_price = 2000000;
		s1.target = 0.1; // 목표 수익률은 10%
			// s1 에 값을 대입해줌

		s2.name = "LG";
		s2.buy_price = 30000;
		s2.cur_price = 80000;
		s2.target = 0.2;

		s3.name = "Kakao";
		s3.buy_price = 3000;
		s3.cur_price = 1000;
		s3.target = 0.3;
			// 각 객체 안에 각 값을 설정해줌.

			// stock.java에서 클래스 (레고 틀)을 잘 만들어놓고
			// 위의 객체들에서 조립을 잘 하면
			// 값만 붙여주면 어디에나 쓸 수 있음


		/*
		System.out.println(s1.name + ": " + s1.isTargetMatched());
		System.out.println(s2.name + ": " + s2.isTargetMatched());
		System.out.println(s3.name + ": " + s3.isTargetMatched());
		*/



		//roboAdvisor robo = new roboAdvisor();
			// 인자가 없는 생성자를 생성, 클래스 이름과 동일하게


		ArrayList<stock> s = new ArrayList<stock>();
			// 객체이름은 s, ArrayList는 클래스 - 크기가 마음대로 줄었다 늘었다 함
		s.add(s1);
		s.add(s2);
		s.add(s3);
			// .add 라는 메소드가 기본제공됨
			// .add의 반대는 .remove


		/*
		stock[] s = new stock[3];
			// 3개 들입 배열을 만들어줌
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		*/


		roboAdvisor robo = new roboAdvisor(s);
			// 생성자를 생성할때 인수를 이미 먼저 넘겨줌
			// new 연산자를 사용해서 객체를 생성
		//robo.setStocks(s);
		robo.showStockNamesToSell();
		// 멤버연산자 (.)를 사용해서 객체 robo의 멤버 (현재는 메소드)에 접근함

		System.out.println("-------------------");

		stock newStock = new stock();
		newStock.name = "셀트리온";
		newStock.buy_price = 50000;
		newStock.cur_price = 100000;
		newStock.target = 0.1;

		robo.addStock(newStock);
		robo.showStockNamesToSell();

	}

}
