package chap99.codingbat.namGungEx.chap11;

import java.util.*;

public class Ex11_16 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("password : ");
			String pw = s.nextLine().trim();
			System.out.println();
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}else if(!(map.get(id)).equals(pw)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				continue;
			}else {
				System.out.println("로그인되었습니다. 환영합니다" + id +"님");
				break;
			}
		}
	}
}
