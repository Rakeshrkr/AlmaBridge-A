package org.example;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		System.out.println("Please enter a number :-");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("-----");
		for(int i = 0 ; i<10 ; i++){
			System.out.println(n*(i+1));
		}

	}

}
