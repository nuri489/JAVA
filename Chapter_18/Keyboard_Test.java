package Chapter_18;

import java.io.IOException;

public class Keyboard_Test {

	public static void main(String[] args) throws IOException {
		
		while(true)
		{
			int i = System.in.read();
			System.out.println(i + " : " + (char)i);
			if(i == 13) // 엔터키에 대한 int 값
			{
				break;
			}
		}
		

	}

}
