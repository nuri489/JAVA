package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCPThreadServer extends Thread {
	
	Socket s;
	TCPThreadServer(Socket s)
	{
		this.s = s;
	}
	
	public void run()
	{
		for(int index=0; index <4; index++)
		{
		
		InputStream i;
		try {
			i = s.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner si = new Scanner(i);
		int fC = si.nextInt();
		System.out.println(++fC);
		
		
//		String fC = si.nextLine();
//		System.out.println(fC + "받았음.");
		// 응답 받음
		
		
		
		String rp = "녕안녕안\n";
		OutputStream o;
		try {
			o = s.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			o.write(rp.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 거꾸로 신호 전송
		
		}
		
		try {
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("연결 해제되었습니다");

	}
	

}

public class TCP_ThredServer_Test {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(20000);
		System.out.println("서버는 10000번 포트에서 동작 중");
		

	}

}
