package Chapter_18;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Test {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress ip1 = InetAddress.getLocalHost();
		
		System.out.println(ip1.getHostAddress());
		// 내 IP 주소
		
		InetAddress ip2[] = InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress inet : ip2)
		{
			System.out.println(inet.getHostAddress());
		}

	}

}
