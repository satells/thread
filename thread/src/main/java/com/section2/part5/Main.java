package com.section2.part5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {

	public static final int MAX_PASSWORD = 200;

	public static void main(String[] args) {

		Random random = new Random();

		Vault vault = new Vault(random.nextInt(MAX_PASSWORD));

		List<Thread> threadList = Arrays.asList(new AscendingHackerThread(vault, "Ascending Hacker Thread"), new DescendingHackerThread(vault, "Descending Hacker Thread"), new PoliceThread());

		threadList.forEach(t -> t.start());

		Set<Thread> threads = Thread.getAllStackTraces().keySet();
		System.out.printf("%-15s \t %-15s \t %-15s \t %s\n", "Name", "State", "Priority", "isDaemon");
		for (Thread t : threads) {
			System.out.printf("%-15s \t %-15s \t %-15d \t %s\n", t.getName(), t.getState(), t.getPriority(), t.isDaemon());
		}

	}

}
