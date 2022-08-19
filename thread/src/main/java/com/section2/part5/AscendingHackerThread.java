package com.section2.part5;

public class AscendingHackerThread extends HackerThread {

	public AscendingHackerThread(Vault vault, String name) {
		super(vault, name);
	}

	@Override
	public void run() {
		for (int guess = 0; guess <= Main.MAX_PASSWORD; guess++) {
			if (vault.isCorrectPassword(guess)) {
				System.out.println(this.getName() + " guessed password " + guess);
				System.exit(0);
			}
		}

	}
}
