package com.twentysixth;

class Tables {
	String tableName;
	int tables = 0;

	public Tables(String tableName) {
		super();
		this.tableName = tableName;
	}

	public synchronized void takeLunch() {
		tables++;
		System.out.println("-----");
		System.out.println("Lunch Taken " + tables + tableName);
		System.out.println("-------------");
	}
}

class RestaurantThread extends Thread {
	Tables t;

	public RestaurantThread(Tables t) {
		this.t = t;
	}

	public void run() {
		t.takeLunch();
	}
	
}

public class ThreadsFood {

	public static void main(String[] args) {
		Tables t1 = new Tables("  table1");
		Tables t2 = new Tables("  table2");
		
		RestaurantThread r1 = new RestaurantThread(t1);
		RestaurantThread r2 = new RestaurantThread(t1);
		r1.start();
		r2.start();
	}

}
