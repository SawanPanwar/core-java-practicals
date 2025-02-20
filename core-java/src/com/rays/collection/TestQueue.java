package com.rays.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {

		// Create a Queue using LinkedList
		Queue<String> queue = new LinkedList<>();

		// Add elements to the queue
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");

		// Display the elements in the queue
		System.out.println("Queue: " + queue);

		// Remove and display the front element using poll()
		System.out.println("Removed front element: " + queue.poll());
		System.out.println("Queue: " + queue);

		// Peek at the front element without removing it
		System.out.println("Front element (peek): " + queue.peek());
		System.out.println("Queue: " + queue);

		// Display the size of the queue
		System.out.println("Size of the queue: " + queue.size());

		// Check if the queue contains a specific element
		System.out.println("Queue contains " + queue.contains("b"));
		
		// Check if the queue contains a specific element
		System.out.println("Queue contains " + queue.element());

	}

}
