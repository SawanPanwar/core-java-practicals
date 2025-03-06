package com.rays.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueueMethods02 {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();
		queue.add("a");
		queue.add("b");
		queue.add("c");

		System.out.println(queue);
		
		queue.clear();

		try {
			queue.remove();
			System.out.println(queue);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		try {
			queue.poll();
			System.out.println(queue);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
