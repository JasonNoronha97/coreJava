package com.twentysixth;

class Greeting {
	public synchronized void sayHello(String name) {
		System.out.print("!");
		System.out.print(name);
		System.out.print("_");
	}
}

class GreetingThread extends Thread{
	String name;
	Greeting greeting;

	/**
	 * @param name
	 * @param greeting
	 */
	public GreetingThread(String name, Greeting greeting) {
		super();
		this.name = name;
		this.greeting = greeting;
	}

	public void run()
	{
		greeting.sayHello(name);
	}
	
	
}

public class SynchroniseDemo {

	public static void main(String[] args) {
		
		Greeting g = new Greeting();
		GreetingThread gt1 = new GreetingThread("Jason",g);
		GreetingThread gt2 = new GreetingThread("Kiran", g);
		
		gt1.start();
		gt2.start();
		
		

	}

}
