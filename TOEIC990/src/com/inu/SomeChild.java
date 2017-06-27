package com.inu;
//com.inu 가문

import univ.inu.Parent;

public class SomeChild extends Parent
{
	
	public SomeChild()
	{
		
		a = 10;
		b = 20;
		//c = 100;	//상속불가능 (default 접근제어자는 같은 패키지 안에서만 상속받는다)
		//d = 20;	//상속불가능	(Private 접근제어자)
		
	}

}
