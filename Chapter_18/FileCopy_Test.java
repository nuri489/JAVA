package Chapter_18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy_Test {

	public static void main(String[] args) {
		
		
		FileReader fr = null;
		FileWriter fw = null;
		String ip = "D:/Download/b.txt";
		String op = "D:/Download/c.txt";
		// b.txt 의 내용을 c.txt 에 복사
		// 만약 c.txt 의 내용이 이미 있다면 그 내용을 지우고 b.txt 의 내용을 입력함

		
		try
		{
			fr = new FileReader(ip);
			fw = new FileWriter(op,true);
			// writer 에 true 를 넣으면 기존의 내용은 유지하고 새로운 내용을 추가함
			
			while(true)
			{
				int result = fr.read();
				fw.write(result);
				if(result == -1)
				{
					break;
				}
				// result == -1 일때까지 계속 복사함
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
				fr.close();
				fw.close();
			}
			catch(IOException e) 
			{ 
			}
		}
		

	}

}
