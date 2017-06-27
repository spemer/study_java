package univ.inu;

public class Child extends Parent	//클래스 Parent 를 상속
{
	
	public Child()
	{
		a = 10;	//부모로부터 옴, 상속 가능 (public)
		b = 100;	//상속 가능 (protected)
		c = 400;	//상속 가능 (defalut 접근제어자)
		//d = 50;	//부모에게는 있지만 상속 불가능 (private)
		
		
		System.out.println("I am Child");
	}

	public void showChild()
	{
		this.showSum(); //자기 자신 클래스의 showSum
		super.showSum(); //부모의 showSum
		System.out.println("this child");
	}
	//***this. => 자기 자신 클래스
	//***super. => 부모의 클래스
	
	
	//method overriding
	//부모에 있는 메소드가 불리는게 아니라, 자식에 있는 메소드가 불림 (showSum)
	//자식에 있는 showSum()
	public void showSum()
	{
		System.out.println("Child showSum();");
	}
	
}
