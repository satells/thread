package com.thread1;

public class PrintServer implements Runnable {
	private final PrintQueue requests = new PrintQueue();

	public PrintServer() {
		new Thread(this).start();
	}

	public void print(PrintJob job) {
		requests.add(job);
	}

	@Override
	public void run() {
		try {
			for (;;) {
				realPrint(requests.remove());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void realPrint(Object remove) {

	}

}
