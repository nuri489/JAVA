package Chapter_10;

public class Exception_Test {

	public static void main(String[] args) {
		
		int i;
		int j =0;
		
		try 
		{
		i = Integer.parseInt(args[0]);
		j = Integer.parseInt(args[1]);
		System.out.println(i/j);
		}
		

		
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("J에 0을 입력하지 마시오");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("값을 입력하시오");
		}
		
		catch(Exception e)
		{
			System.out.println("오류 발생! :" + e);
			e.printStackTrace();
		}
		// Try 를 실행하고 catch 괄호안의 오류에 해당되는 오류 발생시 해당되는 블록의 내용 실행
		// Exception 은 모든 오류를 포함
		// Exception e = new NullPointerException();
		// Exception은 모든 예외에 대하여 상속하는 상위 클래스이다.
		// e.printStackTrace(); 로 어느 줄의 어떤 오류가 나는지 출력 가능
		
		finally
		{
			System.out.println("ASD");
		}
		
		// try,catch 의 결과에 상관없이 무조건 실행
		
		
		System.out.println("끝");

	}

}
