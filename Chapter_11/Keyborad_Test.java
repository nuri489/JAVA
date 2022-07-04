package Chapter_11;

import java.io.IOException;

public class Keyborad_Test {

	public static void main(String[] args) {
		
		try
		{
			System.out.println((char)System.in.read());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		// System.in.read(); 는 IOException 오류 발생!
		// 해결을 위해 메인 옆에 throws IOException 을 붙이던가
		// try , catch 를 통해 해결
		
		System.out.println("가짜 끝");
		System.exit(0);
		System.out.println("진짜 끝");
		// 가짜 끝
		// 	System.exit(0); 실행을 끝내라
		

	}

}
