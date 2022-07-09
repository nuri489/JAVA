package Chapter_18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput_Test {

	public static void main(String[] args)  {

		FileInputStream f1 = null;
		
		try
		{
			f1 = new FileInputStream("C:\\\\Users\\\\nuri4\\\\eclipse-workspace\\\\AI_platform\\\\user.txt");
			
			while(true)
			{
				int result = f1.read();
				System.out.print((char)result);
				if(result == -1) // -1 이라는건 파일의 끝이라는 의미
				{
					break;
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				f1.close();
			}
			catch(IOException e)
			{
				
			}
		}
	}

}
