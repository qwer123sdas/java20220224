package chap99.codingbat.namGungEx;
class Document{
	static int count = 0;
	String name;    // String Document.name과 같은 것?
	
	public Document(){  // 문서 생성 시 문서명을 지정하지 않았을 때 작동하는 생성자
		this("제목없음" + count++);
	}
	
	public Document(String name) { 
		this.name = name; // ?? 
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}
public class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
	}
}
