package Chapter_10;

class B {
	
	void m1(int i) throws ArithmeticException
	{
		if(i == -1)
		{
			throw new ArithmeticException("ㅁㄴㅇㄹ");
		}
		else
		{
			System.out.println(100/i);
		}
		
		// i 값이 -1 일 때 오류를 '일부러' 발생시킴
	}
	
	void m2()
	{
		
	}
}

public class Throw_Test {

	public static void main(String[] args) {
		
		B b1 = new B();
//		b1.m1(-1);
		
		try
		{
			b1.m1(-1);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
