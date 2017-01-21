package org.example;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Please enter a number :-");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2 == 0) System.out.println("This is Even number");
		else System.out.println("This is Odd number");

	}

}
