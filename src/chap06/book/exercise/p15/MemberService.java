package chap06.book.exercise.p15;

public class MemberService {
	
	MemberService(){
	}
	
	boolean login(String id, String password) {
//		if(id.equals("hong") && password.equals("12345")) {
//			return true;
//		}else {
//			return false;
//		}
		return (id.equals("hong") && password.equals("12345"));
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}


}
