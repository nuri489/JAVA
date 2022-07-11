package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCP_ThredClient_Test {

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		
		Socket s = new Socket("112.186.163.46" , 20000);
		// IP 와 포트 번호
		System.out.println(s.getInetAddress().getHostAddress() + "서버와 연결되었습니다");		
		
		
		// 서버와 클라이언트가 연결 되려면 당연하게도 둘 모두 연결 가능한 상태여야 한다.
		// TCPServer_Test.java 파일을 실행하여 서버를 실행 및 대기 중 상태로 바꾸고
		// Clinet에서 접속 요청을 하여 서버와 클라이언트를 연결한다.
		
		for(int index=0; index<4; index++)
		{

			Thread.sleep(1000);
		String ms = "100\n";
		byte[] ms_byte =  ms.getBytes();
		OutputStream o = s.getOutputStream();
		o.write(ms_byte);
		
		System.out.println(ms_byte.length);
		System.out.println(ms + "서버로 메세지 전송");
		// 서버로 응답 요청
		
		InputStream i = s.getInputStream();
		Scanner si = new Scanner(i);
		String fS = si.nextLine();
		System.out.println(fS + "받음");
		
		}
		
		
		
		
		
		
		s.close();
		System.out.println("연결 해제되었습니다.");

	}

}
