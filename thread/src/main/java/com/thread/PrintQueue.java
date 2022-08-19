package com.thread;

public class PrintQueue {

	private SingleLinkQueue<PrintJob> queue = new SingleLinkQueue<PrintJob>();

	public synchronized void add(PrintJob job) {
		queue.add(job);
		notifyAll();

	}

	public synchronized PrintJob remove() throws InterruptedException {
		while (queue.size() == 0) {
			wait();
		}
		return queue.remove();
	}

}
