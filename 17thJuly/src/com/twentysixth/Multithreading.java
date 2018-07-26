package com.twentysixth;

class ThreadDemo extends Thread {

	int x = 0;

	public ThreadDemo(int n) {
		this.x = n;
		System.out.println("Thread created...");
	}

	@Override
	public void run() {
				
		System.out.println(Thread.currentThread().getName() + "----Started   ");
		for (int i = x; i < x + 5; i++) {

			try {
				if (i == x + 2) {
					System.out.println("SleepStarted"+getName());
					sleep(10000);
					System.out.println("SleepEND"+getName());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "  ");
		}
		System.out.println(Thread.currentThread().getName() + "-----Run End   ");
		
	}
}

public class Multithreading {

	public static void main(String[] args) {
		System.out.println("Main Start");

		ThreadDemo t1 = new ThreadDemo(1);
		ThreadDemo t2 = new ThreadDemo(15);
		ThreadDemo t3 = new ThreadDemo(-100);
		ThreadDemo t4 = new ThreadDemo(50);

		t1.setName("Thread ONE!!");
		t2.setName("THREAD TWOOOO!!! LOW PRIO ");
		t3.setName("Thread Threeeee");
		t4.setName("Max Prio Thread");
		// t2.setPriority(1);
		// t4.setPriority(10);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("Main End");
	}

}
