package gmail.jaydenkhr.part14;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSender {

	public static void main(String[] args) {
		DatagramPacket packet = null;
		MulticastSocket socket = null;
		
		try {
			
			socket = new MulticastSocket();
			Scanner sc = new Scanner(System.in);
			//대화명 입력받기
			System.out.println("대화명 입력:");
			String nick = sc.nextLine();
			//접속할 주소 생성
			InetAddress address = InetAddress.getByName("224.128.1.5");
			while(true) {
				System.out.print("전송할 메세지:");
				String msg = sc.nextLine();
				if(msg.equals("종료")) {
					msg = nick + "님이 퇴장하셨습니다.";
					packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 10000);
					socket.send(packet);
					break;
				}else {
					msg = nick + ":" + msg;
					packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 10000);
					socket.send(packet);
				}
			}
			//실행은 receiver를 먼저 실행하고 sender를 실행해서 메시지를 전송해야 합니다.
				
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
		
		}
	}

}
