package com.thread;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread executando.");

		Thread.currentThread().setName("Galeeeeeera!");

		Thread.sleep(180000);

	}

}
