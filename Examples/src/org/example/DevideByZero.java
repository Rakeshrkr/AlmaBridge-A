package org.example;

import java.util.Scanner;

public class DevideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two integers-");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			if(a%b==0){
				System.out.println(a + " is devided by "+ b);
			}
			else 
				System.out.println(a + " is not devided by "+ b);
		} catch (Exception e) {
			
			System.out.println("Error - Arithmetic exception, Number devided by zero");
		}
	}

}
