package com.section3.part7;

public class ThreadInterrupt {

	public static void main(String[] args) {
		Thread thread = new Thread(new BlockingTask());
		thread.start();

		thread.interrupt();
	}

}
