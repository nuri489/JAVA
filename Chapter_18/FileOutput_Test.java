package Chapter_18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput_Test {

	public static void main(String[] args)  {

		FileOutputStream f2 = null;
		
		try
		{
			f2 = new FileOutputStream("D:/Download/Test.java", true);
			f2.write(65);
			f2.write(66);
			f2.write('A');
			
			// 경로에 해당 파일이 존재하면 삭제하고 새로 생성함
			// 없으면 그냥 새로 생성함
			// 경로 뒤에 true 를 붙이면 내용을 유지하고 내용을 추가함.
			// 기본적으로 false가 생략되어 있음
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				f2.close();
			}
			catch(IOException e)
			{
				
			}
		}
	}

}
