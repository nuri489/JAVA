package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws IOException, SocketException {
		
	
		DatagramSocket ds = new DatagramSocket(15000);
		System.out.println("===수신 시작===");
		byte [] receive_byte = new byte[100];
		DatagramPacket pack = new DatagramPacket(receive_byte, receive_byte.length);
			
		ds.receive(pack);
			
		String receive_str = new String(pack.getData(), 0 , pack.getLength());
		System.out.println(receive_str + " 문자열 받음");
		System.out.println("===수신 종료===");
		
		ds.close();
	
		

	}

}
