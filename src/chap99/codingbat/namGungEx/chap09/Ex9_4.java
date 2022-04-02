package chap99.codingbat.namGungEx.chap09;

import java.util.Objects;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPACE", 1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	//
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Card)) {
			return false;
		}
		Card c = (Card)obj;
		return this.kind.contentEquals(c.kind)&& this.number==c.number; 
	}
	
	
	//
	
	public String toString(){
	    return "kind : " + kind + ", number : " + number;
	}
}


public class Ex9_4 {
	public static void main(String[] args) {
		System.out.println(new Card().toString());
		System.out.println(new Card().toString());
	}
}
