package membermanagement;

import java.util.Scanner;

public class MemberControllerImpl implements MemberService{

	@Override
	public boolean memberregister(Member member) {
		System.out.println("회원 가입 처리");
		return false;
	}

	@Override
	public boolean memberout(String password) {
		System.out.println("회원 탈퇴 처리");
		return false;
	}

	@Override
	public Member memberinfo(String id, String password) {
		System.out.println("회원정보 가져오기");
		return null;
	}

	@Override
	public boolean memberupdate(Member member) {
		System.out.println("회원 정보 수정");
		return false;
	}

	@Override
	public boolean memberlogin(String id, String password) {
		System.out.println("로그인");
		return false;
	}

	@Override
	public void memberlogout() {
		System.out.println("로그아웃");
	}

}


