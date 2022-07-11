package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer_Test {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("서버는 10000번 포트에서 동작 중");
		
		while(true)
		{
			Socket s = ss.accept();
			System.out.println(s.getInetAddress().getHostAddress() + "클라이언트와 연결되었습니다");
			
			for(int index=0; index <4; index++)
			{
			
			InputStream i = s.getInputStream();
			Scanner si = new Scanner(i);
			int fC = si.nextInt();
			System.out.println(++fC);
			
			
//			String fC = si.nextLine();
//			System.out.println(fC + "받았음.");
			// 응답 받음
			
			
			
			String rp = "녕안녕안\n";
			OutputStream o = s.getOutputStream();
			o.write(rp.getBytes());
			// 거꾸로 신호 전송
			
			}
			
			s.close();
			System.out.println("연결 해제되었습니다");
			
			break;
		}
		

	}

}
