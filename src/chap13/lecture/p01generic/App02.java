package chap13.lecture.p01generic;

public class App02 {
	public static void main(String[] args) {
		Container2 con1 = new Container2();
		con1.setContent("java");
		String str = (String)con1.getContent(); // 위험
		
		Container2 con2 = new Container2();
		con2.setContent(1);
		Object i = con2.getContent();
		int i2 = (Integer)i;
		
	}
	
}

class Container2{
	private Object content;
	
	public void setContent(Object content) {
		this.content = content;
	}
	public Object getContent() {
		return content;
	}
}
