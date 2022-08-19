package com.thread;

public class PrintServer2 {
	private final PrintQueue requests = new PrintQueue();

	public PrintServer2() {
		Runnable service = new Runnable() {

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

		};

		new Thread(service).start();
	}

	public void print(PrintJob job) {
		requests.add(job);
	}

	private void realPrint(Object remove) {

	}
}
