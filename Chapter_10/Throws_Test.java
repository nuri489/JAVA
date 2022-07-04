package Chapter_10;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Test {
	
	void m1(int i) throws ArithmeticException
	{
		System.out.println(100 / i);
	}
	// throws ArithmeticException
	// Ari.. 오류가 발생할꺼야 라고 전달함
	// 그러니 일단 예외하고 다음 순서로 진행해!
	
	
	void m2()
	{
		try
		{
			m1(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 못나눔");
		}
	}
	// main이 아닌 메소드를 정의하는 곳에서 예외 처리를 함
	
	void m3(int i)
	{
		try 
		{
			m1(0);
		}
		catch(ArithmeticException e)
		{
			m1(i);
		}
	}
	// m1 메소드에 0 값을 넣고 실행 후 Ari 오류 발생시 m1에 i 값 입력 후 실행
	
	void m4()
	{
		try
		{
			m1(0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	// e.printStackTrace(); 
	// 오류 log 출력
	
	
	void m5()
	{
		try
		{
			FileReader fr = new FileReader("A.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}

public class Throws_Test {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.m2();
		t1.m3(100);
		t1.m4();
		t1.m5();
		

	}

}
