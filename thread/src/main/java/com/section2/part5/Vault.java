package com.section2.part5;

public class Vault {

	private int password;

	public Vault(int password) {
		this.password = password;
		System.out.println(password + " to discover");
	}

	public boolean isCorrectPassword(int guess) {

		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
		}

		return this.password == guess;

	}
}
