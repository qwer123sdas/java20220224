package chap99.codingbat.namGungEx.chap09;

public class Ex9_10 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		String strVal2 = iVal + "";
		
		double dVal = 200.0;
		String strVal3 = dVal + "";
		
		double sum = Integer.valueOf("+" + strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("",  strVal, "+", strVal2, "=")+sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
		
		

		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb==sb2);
		System.out.println(sb.equals(sb2));
		
		String s = sb.toString();
		String s2 = sb.toString();
		
		System.out.println(s.equals(s2));
		
		System.out.println("----------");
		
		StringBuffer s11 = new StringBuffer("Abc");
		StringBuffer s22 = s11.append("ZZ");
		System.out.println(s11==s22);
		System.out.println(s11.equals(s22));
		
		StringBuffer sbsrc = new StringBuffer(100);
		sbsrc.append("abcd");
		int a = sbsrc.length();
		System.out.println(a);
		System.out.println(sbsrc.capacity());
			
	
		
	}


}
