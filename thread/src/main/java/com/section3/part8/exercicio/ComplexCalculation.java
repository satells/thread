package com.section3.part8.exercicio;

import java.math.BigInteger;

public class ComplexCalculation {

	public static void main(String[] args) throws InterruptedException {

		BigInteger base1 = new BigInteger("2455454545545456464646445645645645646544564646456");
		BigInteger power1 = new BigInteger("150000000456456445645645456456456456456465465456460");
		BigInteger base2 = new BigInteger("2");
		BigInteger power2 = new BigInteger("10000");

		BigInteger result = new ComplexCalculation().calculateResult(base1, power1, base2, power2);

		System.out.println(result);

		System.exit(0);

	}

	public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) throws InterruptedException {

		CalculationThread calcA = new CalculationThread(base1, power1);
		CalculationThread calcB = new CalculationThread(base2, power2);

		calcA.setDaemon(true);
		calcB.setDaemon(true);

		calcA.start();
		calcB.start();

		calcA.join(3000);
		calcB.join(3000);

		BigInteger resultA = calcA.getResult();
		System.out.println("Resultado de A: " + resultA);
		BigInteger resultB = calcB.getResult();
		System.out.println("Resultado de B: " + resultB);

		BigInteger result = resultA.add(resultB);
		return result;
	}

}