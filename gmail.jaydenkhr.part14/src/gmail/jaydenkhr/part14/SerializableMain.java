package gmail.jaydenkhr.part14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class DTO implements Serializable{
	private int num;
	private String name;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + "]";
	}	
	
	
}
public class SerializableMain {
	public static void main(String[] args) {
		//인스턴스 단위로 전송하기 위한 스트림 변수
		ObjectOutputStream oos = null;
		try {
			//현재 디렉토리에 instance.txt 파일의 경로를 갖는 인스턴스 생성
			oos = new ObjectOutputStream(new FileOutputStream("./instance.txt"));
			
			List<DTO> list = new ArrayList<>();
			DTO dto = new DTO();
			dto.setNum(1);
			dto.setName("KHR");
			
			list.add(dto);   //1개만 생성시 list 생략
			
			dto = new DTO();
			dto.setNum(2);
			dto.setName("KWJ");
			
			list.add(dto);
			
			oos.writeObject(dto);
			
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			try {
				oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		//인스턴스 단위로 읽기
		ObjectInputStream ois = null;
		try {
			//현재 디렉토리의 instance.txt 파일의 내용을 읽을 수 있는
			//ObjectInputStream 인스턴스 생성
			ois = new ObjectInputStream(
					new FileInputStream("./instance.txt"));
			Object obj  = ois.readObject();
			//Object 타입을 리턴받은 경우 수행할 작업?
			List<DTO> list = (List<DTO>)obj;
			for(DTO temp : list) {
				System.out.println(temp);
			}
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//try() 안에서 생성된 인스턴스 중에서 AutoCloseable 인터페이스를
		//구현한 인스턴스는 마지막에 close를 자동으로 호출합니다.
		try(Scanner sc = new Scanner(System.in);){
			sc.nextInt();
		}catch(Exception e) {}

	}

}
