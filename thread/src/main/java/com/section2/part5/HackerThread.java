package com.section2.part5;

public abstract class HackerThread extends Thread {

	protected Vault vault;

	public HackerThread(Vault vault, String name) {
		super(name);
		this.vault = vault;
		this.setPriority(Thread.MAX_PRIORITY);
	}

	@Override
	public synchronized void start() {

		System.out.println("Starting Thread: " + this.getName());
		super.start();
	}

}
