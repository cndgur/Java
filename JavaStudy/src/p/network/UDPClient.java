package p.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

    public static void main(String[] args) throws SocketException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("보낼메세지 : ");
        String msg = sc.nextLine();
        
        InetAddress inet;
        int port = 4000;
        
        try {
            DatagramSocket dsoc = new DatagramSocket();
            try {
                inet = InetAddress.getByName("192.168.30.2");
                // 전송할 데이터 생성
                DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, inet, port);
                try {
					dsoc.send(dp);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            } catch (UnknownHostException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                dsoc.close(); // 소켓 자원 해제
            }
        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        sc.close(); // Scanner 자원 해제
    }
}
