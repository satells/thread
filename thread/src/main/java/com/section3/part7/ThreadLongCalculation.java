package com.section3.part7;

import java.math.BigInteger;

public class ThreadLongCalculation {

	public static void main(String[] args) {

		Thread thread = new Thread(new LongComputationTask(new BigInteger("20000"), new BigInteger("1000000")));

		thread.setDaemon(true);

		thread.start();

		thread.interrupt();
	}

}
