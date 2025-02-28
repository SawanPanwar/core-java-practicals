package com.rays.thread;

public class TestDaemonThread {

	public static void main(String[] args) {

		BackgroundThread t1 = new BackgroundThread("daemon thread");

		t1.setDaemon(true);

		t1.start();

		for (int i = 1; i <= 50; i++) {

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(i + " main");
		}
	}

}
