package gmail.jaydenkhr.part19;

public class Member {
	private String memberid;
	private String memberpw;
	private String membername;
	private String memberphone;
	private String memberemail;
   	private String membernickname;
   	private String memberaddr;
   	private int membercardnumber;
   	
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getMemberpw() {
		return memberpw;
	}
	public void setMemberpw(String memberpw) {
		this.memberpw = memberpw;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMemberphone() {
		return memberphone;
	}
	public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	}
	public String getMemberemail() {
		return memberemail;
	}
	public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	}
	public String getMembernickname() {
		return membernickname;
	}
	public void setMembernickname(String membernickname) {
		this.membernickname = membernickname;
	}
	public String getMemberaddr() {
		return memberaddr;
	}
	public void setMemberaddr(String memberaddr) {
		this.memberaddr = memberaddr;
	}
	public int getMembercardnumber() {
		return membercardnumber;
	}
	public void setMembercardnumber(int membercardnumber) {
		this.membercardnumber = membercardnumber;
	}
	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", memberpw=" + memberpw + ", membername=" + membername
				+ ", memberphone=" + memberphone + ", memberemail=" + memberemail + ", membernickname=" + membernickname
				+ ", memberaddr=" + memberaddr + ", membercardnumber=" + membercardnumber + "]";
	}
	
	
}


