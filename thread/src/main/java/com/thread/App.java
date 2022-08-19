package com.thread;

public class App extends Thread {

	@Override
	public void run() {

		try {
			System.out.println(Thread.currentThread());
			Thread.sleep(11100);
		} catch (InterruptedException e) {
			return;
		}

	}

	public static void main(String[] args) {
		App app = new App();

		app.start();
	}
}
