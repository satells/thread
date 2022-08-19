package com.thread0;

public class ThreadException {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("fdasfd");

				throw new RuntimeException("calculo errado");
			}
		});

		thread.setName("Calculando");

		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Thread " + t.getName() + " the error is: " + e.getMessage());
			}
		});

		thread.start();
	}
}