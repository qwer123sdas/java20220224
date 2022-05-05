package chap99.codingbat.namGungEx.chap13;

import java.util.ArrayList;

class Customer implements Runnable{
	private Table table; 
	private String food;
	
	Customer(Table table, String food){
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try {Thread.sleep(10);}catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
}

class Cook implements Runnable{
	private Table table;
	
	Cook(Table table){ this.table = table;}
	
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(100); } catch(InterruptedException e){}
		}
	}
	
	
}

class Table{
	String[] dishNames = {"donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting.");
			try {
				wait(); // COOK쓰레드를 기다리게 한다.
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
		dishes.add(dish);
		notify();  // 기다리는 Cust를 꺠우기 위함
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public void remove (String dishName) {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			
			while(dishes.size() == 0) {
				System.out.println(name + " is waiting. remove...");
				try { 
					wait(); // Cust 쓰레드를 기다리게 한다
					Thread.sleep(500);
				} catch(InterruptedException e) {}
			}
			
			while(true) {
				for(int i = 0; i < dishes.size(); i++) { // 원하는 음식을 찾는 것
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify(); // 잠자고 있는  COOK을 꺠움
						return;
					}
				}
				
				try {
					System.out.println(name + " is waiting.");
					wait();// 원하는 음식이 없는 Cust쓰레드를 기다리게 한다.
					Thread.sleep(500);
				}catch(InterruptedException e) {}
			}
		}
	}
	public int dishNum() { return dishNames.length; }
	
}

// 단 누가 wait()하고 notify()하는지 알 수 없다.
// 이 단점을 커버하는 것이 바로 Lock & Condition이다.

public class Ex13_14 {
	public static void main(String[] args) throws Exception{
		Table table = new Table();
		
		new Thread(new Cook(table), "Cook").start();
		new Thread(new Customer(table, "donut"), "cust1").start();
		new Thread(new Customer(table, "burger"), "Cust2").start();
		Thread.sleep(2000);
		System.exit(0);
	}
}
