package com.section3.part7;

public class BlockingTask implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(500000);
		} catch (InterruptedException e) {
			System.out.println("Existing blocking thread.");
		}
	}

}
