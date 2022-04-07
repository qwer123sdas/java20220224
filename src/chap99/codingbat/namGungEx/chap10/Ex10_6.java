package chap99.codingbat.namGungEx.chap10;

import java.text.DecimalFormat;

public class Ex10_6 {
	public static void main(String[] args) {
		double number = 1234567.89;
		String[] patterns= {				
				"0",
				"#",
				"0.0",
				"#.#",
				"0000000000.0000",
				"##########.####",
				"0E0",
				"#E0"	
		};
		
		for(String pattern : patterns) {
			DecimalFormat df = new DecimalFormat(pattern);
			System.out.printf("%19s : %s\n", pattern, df.format(number));
		}
		
	}
}
