package classBasic;

import java.util.*;

public class calcTester {
	
	int channel;
	int volume;
	String brand;
	String onOff;
	
	public static void main(String[] args)
	//���α׷��� ������������ main() �޼ҵ带 ������
	{
		Scanner getBrand = new Scanner(System.in);
		System.out.printf("Brand: ");
		String _Brand = getBrand.nextLine();

		calcTester tv = new calcTester();	//Ŭ���� �̸� calcTester ���� tv ��� ��ü�� ����
		tv.channel = 5;
		tv.volume = 10;
		tv.brand = _Brand;
		tv.onOff = "on";	//��ü�� ����� �����Ͽ� ���� ����
		
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
