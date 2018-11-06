package com.rituj.programs.basics;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter the limit of the series");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		
		fibonaciUsingLoop(limit);
		
		
		scanner.close();
		
		}

	public static void fibonaciUsingLoop(int limit) {
		if(limit == 1) {
			System.out.println("1");
			return;
		}
		
		if(limit == 2) {
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
}
