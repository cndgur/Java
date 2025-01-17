package p.network;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {

		int port = 4000;
		
		try {
			//서버가 4000포트로 결합하여 요청을 받을 준비를 한다.
			DatagramSocket dsoc = new DatagramSocket(port);
			
			//전송받은 데이터를 지정할 바이트배열
			byte[] data = new byte[60000];
			
			//클라이언트로부터 받은 packet객체 생성
			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("데이터 받을 준비 완료");
			while(true) {
				try {
					dsoc.receive(dp);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("클라이언트 ip : " + dp.getAddress());
				String message = null;
				try {
					message = new String(dp.getData(), "UTF-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("클라이언트가 보낸 내용 : " + message);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}

}
