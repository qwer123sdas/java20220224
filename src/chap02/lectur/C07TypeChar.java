package chap02.lectur;

public class C07TypeChar {
	public static void main(String[] args) {
		// 문자형 : char(2byte)
		char var1 = ' ';
//		char var2 = ''; //x
		char var3 = '\\';
		char var4 = 'a';
		char var5 = '가';
		char var6 = '나';
		
		char var7 = '\uac00'; //유니코드의 약자 : \uac00
		System.out.println(var7);
		
		int var8 = var7;
		System.out.println(var8);
		
		
	}
}
