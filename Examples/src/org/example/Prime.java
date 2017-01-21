package org.example;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Please enter a number :-");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0 ;
		for(int i= n ; i>0 ; i-- ){
			if(n% i ==0) count ++ ;
		}
		if(count>2) System.out.println("This is not a prime number");
		else System.out.println("This is a prime number");

	}

}
