package com.section3.part8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InterruptThreadWithJoin {

	public static void main(String[] args) throws InterruptedException {

//		List<Long> inputNumbers = Arrays.asList(0L, 140L, 305L, 294L, 555L, 437L);
		List<Long> inputNumbers = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
			Random random = new Random();

			inputNumbers.add((long) random.nextInt(600));
		}

		List<FactorialThread> threads = new ArrayList<>();

		for (long inputNumber : inputNumbers) {
			threads.add(new FactorialThread(inputNumber));
		}

		for (Thread thread : threads) {
			thread.start();
		}

		for (Thread thread : threads) {

			thread.join();
		}

		for (int i = 0; i < inputNumbers.size(); i++) {
			FactorialThread factorialThread = threads.get(i);
			if (factorialThread.isFinished()) {
				System.out.println("Factorial of " + inputNumbers.get(i) + " is " + factorialThread.getResult());
			} else {
				System.out.println("The calculatin for " + inputNumbers.get(i) + " is still in progress.");
			}

		}

	}

}
