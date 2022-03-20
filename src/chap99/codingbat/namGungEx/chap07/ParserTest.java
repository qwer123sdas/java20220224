package chap99.codingbat.namGungEx.chap07;

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParseable("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParseable("HTML");
		parser.parse("document2.html");
	}
}

interface Parseable{
	public abstract void parse(String fileName); // 구문작업수행
	
}

class ParserManager{
	// 리턴타입이 Parseable인터페이스이다.
	public static Parseable getParseable(String type) {
		if(type.equals("XML")){
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + " - XML parsing completed");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed");
	}
}