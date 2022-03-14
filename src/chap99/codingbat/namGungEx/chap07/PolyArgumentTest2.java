package chap99.codingbat.namGungEx.chap07;

class Product02{
	int price;
	int bonusPoint;
	Product02(int price){
		this.price = price;
		bonusPoint = (int)(price/10);
	}
	
	Product02(){
		this.price = 0;
		bonusPoint = 0;
	}
}

class Tv02 extends Product02{
	Tv02(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer02 extends Product02{
	Computer02(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio02 extends Product02{
	Audio02(){
		super(300);
	}
	
	public String toString() {
		return "Audio";
	}
}

// 사는 사람
class Buyer02{
	int money = 1000;
	int bonusPoint = 0;
	
	Product02[] item = new Product02[10];
	
	int i = 0;
	
	// 참조형 매개변수 : 또 햇갈림 ㅠㅠㅠㅠㅠ
	void buy(Product02 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // 구입할 제품을 Product 배열에 추가함.
		
		System.out.println(p + "을/를 구입하였습니다.");
	}
	
//	구매한 물품에 대한 정보 요약 메소드
	void summary() {
		// 물건 합계
		int sum = 0;
		// 구입한 물품 목록
		String itemList =""; 
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i = 0; i<item.length; i++) {
			if(item[i] == null) {
				break;
			}else {
			sum += item[i].price; // 왜 price가 붙음????????item참조가 가리키는 대상의 인스턴스니까
			itemList = item[i] + ",";
			}
		}
			System.out.println("구입한 물품의 총 금액 : " + sum);
			System.out.println("구입한 제품 : " + itemList);
	}
}


public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer02 b = new Buyer02();
		
		Product02[] p = new Product02[100];
		p[0] = new Tv02();
		p[1] = new Computer02();
		p[2] = new Audio02();
		
		b.buy(p[0]);
		b.buy(p[1]);
		b.buy(p[2]);
		b.summary();
		
	}
}
