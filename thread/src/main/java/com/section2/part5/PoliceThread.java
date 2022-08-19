package com.section2.part5;

public class PoliceThread extends Thread {

	@Override
	public void run() {
		setName("Police");
		for (int i = 10; i > 0; i--) {

			try {
				sleep(10000);
			} catch (InterruptedException e) {
			}
			System.out.println("Discovered in: " + i);
		}

		System.out.println("Game over for you hackers");
		System.exit(0);
	}

}
