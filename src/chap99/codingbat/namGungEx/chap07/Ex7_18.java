package chap99.codingbat.namGungEx.chap07;

import java.awt.*;


public class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("actionEvent occurred!!");
			}
		});
	}
}


