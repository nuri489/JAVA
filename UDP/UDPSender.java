package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

import Chapter_18.InetAddress_Test;

public class UDPSender {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket sender = new DatagramSocket();
		// 포트를 랜덤으로 지정됨
		System.out.println("===발신 시작===");
		
		String ms = "ㅎㅎㅎㅎ";
		byte [] ms_byte = ms.getBytes();
		// ㅎㅎㅎㅎ를 byte 타입의 배열로 바꿈
		
		
		DatagramPacket pack = new DatagramPacket(ms_byte, ms_byte.length, new InetSocketAddress("112.186.163.46" , 15000));
		// ms_byte를 ms_byte.length의 길이만큼, 해당 주소로 발신
		sender.send(pack);
		System.out.println("===발신 종료");
		
		sender.close();

	}

}
