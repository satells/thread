package com.section2.part5;

public class DescendingHackerThread extends HackerThread {

	public DescendingHackerThread(Vault vault, String name) {
		super(vault, name);
	}

	@Override
	public void run() {
		for (int guess = Main.MAX_PASSWORD; guess > 0; guess--) {
			if (vault.isCorrectPassword(guess)) {
				System.out.println(this.getName() + " guessed password " + guess);
				System.exit(0);
			}

		}
	}

}
