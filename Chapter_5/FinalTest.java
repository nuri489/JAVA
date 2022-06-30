package Chapter_5;

final class Math {
	
	final int abs(int i)
	{
		if(i >= 0 )
		{
			return i;
		}
		else
		{
			return i*(-1);
		}
	}
}

class MyMath /*extends Math*/ { // final 클래스는 상속 할 수 없다.
	
	Math i = new Math();
	
}

public class FinalTest {

	public static void main(String[] args) {
		
		MyMath m = new MyMath();
		int r1 = m.i.abs(10);
		
		// final 클래스는 상속을 할 수 없지만
		// Math i = new Math(); 로 객체를 생성하고
		// 다시 MyMath = new MyMath(); 로 객체를 생서하여 메소드를 사용 가능함
		
		System.out.println(r1);

	}

}
