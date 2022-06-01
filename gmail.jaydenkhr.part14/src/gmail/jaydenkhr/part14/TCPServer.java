package gmail.jaydenkhr.part14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		//서버 소켓과 클라이언트와 통신에 사용할 소켓
		ServerSocket ss = null;
		Socket socket = null;
		
		try {
			//서버 소켓 생성
			//9000번 포트로 요청을 받을 수 있도록 생성(본인 결정)
			ss = new ServerSocket(9000);
			System.out.println("서버 대기 중...");
			while(true) {
				//클라이언트의 요청을 대기
				socket = ss.accept();
				//접속한 클라이언트 정보 확인
				System.out.println("클라이언트 정보:" + socket.toString());
				
				//클라이언트가 전송한 문자열 읽기
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				//한줄 읽기   
				//여러줄일 경우 반복문 사용
				String msg = br.readLine();
				System.out.println("보내온 메시지:" + msg);
				
				br.close();
				socket.close();
			}
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			
		}

		}

}
