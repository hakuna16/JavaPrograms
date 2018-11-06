package com.rituj.programs.basics;

import java.util.HashMap;
import java.util.Scanner;

/**
 * This class is used to get the fibonacci series from the given set of limit.
 * Fibonacci series e.g. 1 1 2 3 5 8 13 ...
 * 
 * @author Rituj Kumar
 *
 */
public class FibonaciSeries {

	public static void main(String[] args) {

		System.out.println("Enter the limit of the series");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();

		// fibonaciUsingLoop(limit);
		// fibonaciUsingReccursion(limit);
		fibonaciUsingMemorization(limit);

		scanner.close();

	}

	/**
	 * This method will first take the total limit of the series which we want to
	 * print. The it will check if the limit is 1 or 2 then it will print the first
	 * and the second numbers of the series else, it will iterate over the limit and
	 * print the series.
	 * 
	 * @param limit
	 *
	 */
	public static void fibonaciUsingLoop(final int limit) {
		if (limit == 1) {
			System.out.println("1");
			return;
		}

		if (limit == 2) {
			System.out.println("1 1");
			return;
		}

		int f1 = 1;
		int f2 = 1;
		System.out.println(f1);
		System.out.println(f2);
		for (int i = 2; i < limit; i++) {
			int f = f1 + f2;

			System.out.println(f);
			f1 = f2;
			f2 = f;

		}
	}

	/**
	 * This method is the most efficient method to calculate the Fibonacci series
	 * for a given set of limit. Here we will create a hash map of number and its
	 * fibonachi one its the number is there we can directly return the fibonachi
	 * of that number
	 * 
	 * @param limit
	 */
	public static void fibonaciUsingMemorization(final int limit) {
		System.out.println(improvedFibonacci(limit));
	}

	/**
	 * with this method we are going to use recursion
	 * 
	 * @param limit
	 */
	public static void fibonaciUsingReccursion(final int limit) {
		System.out.println("Fibonacci series upto " + limit + " numbers using reccursion");
		for (int i = 1; i <= limit; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

	/**
	 * Java program for Fibonacci number using recursion. This program uses tail
	 * recursion to calculate Fibonacci number for a given number
	 * 
	 * @return Fibonacci number
	 */
	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);

	}

	/**
	 * 
	 * @param limit
	 * @return
	 */
	public static int improvedFibonacci(final int limit) {
		HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
		Integer fibonacci = cache.get(limit);
		if (fibonacci != null) {
			return fibonacci;
		}
		fibonacci = fibonacci(limit);
		cache.put(limit, fibonacci);
		return fibonacci;
	}
}
