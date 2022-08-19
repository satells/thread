package com.thread1;

public class PingPong implements Runnable {

	private String word;
	private int delay;

	public PingPong(String whatToSay, int delayTime) {
		word = whatToSay;
		delay = delayTime;
	}

	public void run() {

		try {
			for (;;) {
				System.out.println(word + " ");
				Thread.sleep(delay);
			}
		} catch (InterruptedException e) {
			return;
		}
	}

	public static void main(String[] args) {
		new Thread(new PingPong("ping", 33), "ping - start").start();
		new Thread(new PingPong("PONG", 100), "PONG - start").start();

	}

}
