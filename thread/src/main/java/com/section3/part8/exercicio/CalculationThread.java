package com.section3.part8.exercicio;

import java.math.BigInteger;

public class CalculationThread extends Thread {

	private BigInteger base;
	private BigInteger power;
	private BigInteger result = BigInteger.ONE;
	private boolean finished = false;

	public CalculationThread(BigInteger base, BigInteger power) {
		this.base = base;
		this.power = power;
	}

	@Override
	public void run() {
		for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
			result = result.multiply(base);

		}

	}

	public boolean isFinished() {
		return finished;
	}

	public BigInteger getResult() {
		return result;
	}

}
