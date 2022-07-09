package Chapter_18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileClass_Test {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\Download\\b.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		
		FileInputStream fis = new FileInputStream("D:\\Download\\b.txt");
		
	
		if(f.exists())
		{
			if(f.isFile())
			{
				System.out.println(f.length());
				System.out.println(f.getCanonicalPath());
				System.out.println(sdf.format(f.lastModified()));
				// 파일이면 크기와 경로, 마지막 수정 시간 표시
			}
			else
			{
				String details[] = f.list();
					for(String d : details)
					{
						System.out.println(d);
						// 디렉토리이면 해당 디렉토리의 파일 목록 표시
					}
			}	
		}
		else
		{
			System.out.println("파일 없으니까 생성한다!");
			f.createNewFile();
			f.mkdir();
			// 디렉토리에 파일이 없을 경우 생성
		}
		
			
	}

}
