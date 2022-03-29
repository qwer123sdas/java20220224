package chap15.book.exercise.p7;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList(){
		List<Board> list1 = new ArrayList<>();
		list1.add(new Board("제목1", "내용1"));
		list1.add(new Board("제목2", "내용2"));
		list1.add(new Board("제목3", "내용3"));
		return list1;
	}

	

	
}
