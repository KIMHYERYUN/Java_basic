package gmail.jaydenkhr.part14;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		//서버 소켓 불필요
		Socket socket = null;
		try {
			//한줄 입력받기
			System.out.print("전송할 메시지");
			Scanner sc = new Scanner(System.in);
			String msg = sc.nextLine();
			
			//송신하기 위해 socket 생성
			InetAddress address = InetAddress.getByName("192.168.10.32");
			socket = new Socket(address,9000);
			
			//소켓을 이용해서 전송할 스트림 생성
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			//문자열 전송
			pw.println(msg);
			pw.flush();
			pw.close();
			
			sc.close();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			try {
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}//TCPServer 활성화 후 TCPClient 활성화하여 입력
	}
}
