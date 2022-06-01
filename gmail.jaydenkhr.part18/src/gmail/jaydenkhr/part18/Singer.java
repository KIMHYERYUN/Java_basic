package gmail.jaydenkhr.part18;

import java.sql.Date;

//프로젝트에 DTO 클래스 생성
public class Singer {
	private int num;
	private String name;
	private Date birthday;
	private String songs;
	private String hometown;
	

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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSongs() {
		return songs;
	}
	public void setSongs(String songs) {
		this.songs = songs;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	
	@Override
	public String toString() {
		return "Singer [num=" + num + ", name=" + name + ", birthday=" + birthday + ", songs=" + songs + ", hometown="
				+ hometown + "]";
	}
	
}
