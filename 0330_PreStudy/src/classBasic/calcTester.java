package classBasic;

import java.util.*;

public class calcTester {
	
	int channel;
	int volume;
	String brand;
	String onOff;
	
	public static void main(String[] args)
	//프로그램의 시작점에서만 main() 메소드를 가진다
	{
		Scanner getBrand = new Scanner(System.in);
		System.out.printf("Brand: ");
		String _Brand = getBrand.nextLine();

		calcTester tv = new calcTester();	//클래스 이름 calcTester 안의 tv 라는 객체를 생성
		tv.channel = 5;
		tv.volume = 10;
		tv.brand = _Brand;
		tv.onOff = "on";	//객체의 멤버에 접근하여 값을 지정
		
		if (tv.onOff == "on")
		{
			tv.onOff = "Status: On";
		}
		
		
		calcTester tv2 = tv;
		
		
		//System.out.printf("Channel is %d, volume is %d, and %s\n", tv.channel, tv.volume, tv.onOff);
		System.out.printf("Channel is %d, volume is %d, brand is %s, and %s.\n",
				tv2.channel, tv2.volume, tv2.brand, tv2.onOff);
		
	}

}
