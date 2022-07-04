package Chapter_10;

import java.io.FileNotFoundException;
import java.io.FileReader;

class A {
	
	void m1(int i) throws ArithmeticException , FileNotFoundException
	{
		System.out.println(100/i);
		FileReader fr = new FileReader("b.txt");
	}
	
	void m2() throws ArithmeticException, FileNotFoundException
	{
		m1(0);
	}
}

public class Throws_Test2 {

	public static void main(String[] args) throws Exception {
		
		A a1 = new A();
		
		try
		{
			a1.m2();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("!");
		}
		catch(ArithmeticException e)
		{
			System.out.println("?");
		}
		// 1. m2 메소드 실행. Ari 오류 발생. throws 로 해당 오류 전달
		// 2. m1 메소드에 Ari 오류 도착. 다시 throws 로 해당 오류 전달
		// 3. catch 에서 File 오류는 전달받지 못함.
		// 4. 따라서 ? 출력
		
		
		int i = -1;
		if(i == -1)
		{
			throw new ArithmeticException();
		}
		// if문 만족시 ari 오류 전달
		// 즉, 오류가 발생하지 않을 상황이지만 강제로 오류를 발생시킴
		
		
		
		

	}

}
