package gmail.jaydenkhr.part14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class DAUMSocket {

	public static void main(String[] args) {
		//입출력은 try-catch 구문
		//다른 장비와 통신하기 위한 변수
		Socket socket = null;
		InetAddress address = null;
		//문자단위로 쓰고 읽기 위한 변수
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			//통신하고자 하는 곳의 주소를 생성
			address = InetAddress.getByName("www.daum.net");
			//통신을 위한 소켓 생성
			//address는 ip : 장비를 구분하기 위한 주소
			//80은 port 번호 : 그 장비 안에서 서비스(프로그램)을 구분하기 위한 번호
			socket = new Socket(address, 80);
					
			//읽고 쓰기 위한 스트림을 생성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			//메시지 보내기
			out.println("GET http://www.daum.net");
			out.flush();

			//보내준 메시지 읽기
			while(true) {
				String line = in.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally{
			try {
				out.close();
				in.close();
				socket.close();
			}catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
			

		}
	}
}
