package com.thread0;

public class ExtendingThread {

	public static void main(String[] args) {

		NewThread thread = new NewThread("Calcular");

		thread.start();
	}

	public static class NewThread extends Thread {

		public NewThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			System.out.println("Current thread: " + this.getName());
		}

	}
}
