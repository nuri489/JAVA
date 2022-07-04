package Chapter_11;

public class StringClass_Test {

	public static void main(String[] args) {
		
		
		char C[] = new char[100];
		int index = 0;
		
		try
		{
			while(true)
			{
				int result = System.in.read();
				if(result == '\n')
				{
					break;
				}
				C[index++] = (char)result;
			}
			
			// result 에 값을 입력받음
			// result 를 char 로 바꾸며 C 배열에 입력
			// index ++ 를 통해서 0~100까지 반복문을 반복 하며 차례대로 값을 입력
			
			String sc = new String(C);
			System.out.println(sc.toUpperCase());
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
