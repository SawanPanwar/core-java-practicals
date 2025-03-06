package com.rays.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueueMethods01 {

	public static void main(String[] args) {

		Queue<String> queue = new ArrayBlockingQueue<>(2);

		System.out.println("Queue add => ");

		try {
			queue.add("a");
			queue.add("b");
			queue.add("c");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		queue.clear();

		System.out.println();
		System.out.println("Queue offer => ");

		try {
			queue.offer("a");
			queue.offer("b");
			queue.offer("c");
			System.out.println(queue);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
