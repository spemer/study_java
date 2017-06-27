package univ.inu;
//univ.inu 가문

public class Parent
{

	public int a;	//모두다 접근 가능
	protected int b;	//외부 클래스에서 접근할 수 없지만, 자식클래스에는 상속해줄 수 있다 (보호받음)
	int c;	//외부 클래스에서 접근할 수 없지만, 자식에게는 상속해줄 수 있다
	private int d;	//부모가 절대 물려주지 않는다
	//멤버의 접근제어자가 모두 다름
	
	public Parent()
	{
		System.out.println("I am parent");
		
		a = 20;
		b = 30;
		c = 40;
		d = 50;
	}
	
	
	//*method overloading* (같은 이름의 메소드를 쓸 때)
	//반드시 인수 개수, 타입이 다를 때. 매개변수의 순서가 달라도 가능
	//반환형은 상관 없음
	
	public void showSum()	//메소드, 매개변수가 없음
	{
		System.out.println("Parent showSum(); sum is " + +(a+b+c));
	}
	
	//*method overloading*
	public void showSum(int c)	//매개변수가 존재
	{
		
	}
	
	//*method overloading*
	public void showSum(int c, int d)
	{
		
	}
	
}
