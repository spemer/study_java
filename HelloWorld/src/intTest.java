public class intTest // 클래스 intTest 가 시작되는 문장
{
	public static void main (String args[]) // 메소드 main 이 시작되는 문장
	// (String[] args) 와 (String args[]) 이 무슨 차이인지 질문하기
	{
		final char k = '가'; // k 에 '가'라는 초기값을 저장
		boolean bln_value;
		
		bln_value = true;
		bln_value = ( 3 < 1 );
		
		System.out.println("K = " + k); // 출력
		System.out.println("3 < 1 = " + bln_value);
	}
}

class cerealName
{
	public static void main (String args[])
	{
		final char Ka = '가';
		boolean bln_calc;
		
		bln_calc = ( 2 < 5 );
		System.out.println(Ka);
		System.out.println(bln_calc);
	}
}

// *** public 이 붙은 클래스는 항상 [.java] 파일과 이름이 일치해야 한다 (누구나 호출 가능) ***
// static = 정적 메소드
// void = 결과값을 반환하지 않음
// main = 메소드의 이름

class light
{
	public static void main (String[] args)
	{
		long lightSpeed, distance; // 변수 선언
		
		lightSpeed = 300000; // 변수에 값 저장
		distance = lightSpeed * 365L * 24 * 60 * 60;
		
		System.out.println("It moves " + distance + " km per one year");
	}
}

class lightSpeedCalTime
{
	public static void main (String[] args)
	{
		final double lightSpeed = 30e4;
		double distance = 40e12;
		
		double secs;
		
		secs = distance/lightSpeed;
		
		double lightYear = secs/(60.0*60.0*24.0*365.0);
		System.out.println("It takes " + lightYear +" Light Years.");
	}
}

class intTest2 // 두번째 class 를 지정하기 위해서는 public 을 빼줘야 한다
{
	public static void main (String[] args)
	{
		System.out.println("Obama"); // 단순 string 출력
	}
}