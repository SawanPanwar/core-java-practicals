package com.rays.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueueMethods03 {

	public static void main(String[] args) {

		Queue<String> queue = new ArrayBlockingQueue<>(3);

		queue.add("a");
		queue.add("b");
		queue.add("c");

		queue.clear();

		try {
			queue.element();
			System.out.println(queue);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		try {
			queue.peek();
			System.out.println(queue);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}