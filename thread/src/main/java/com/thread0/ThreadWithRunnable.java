package com.thread0;

public class ThreadWithRunnable {
	static Runnable run = () -> {
		Thread.currentThread().setName("Calculando produto 1");
		getCurrentThread();
	};

	private static void getCurrentThread() {
		System.out.println("Current thread: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		getCurrentThread();
		Thread thread = new Thread(run, "Sucesso");

		thread.start();
		getCurrentThread();
	}

}
