package org.example;

import java.util.Scanner;

public class ABCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose of the below options:-");
		System.out.println("1. Play Game");
		System.out.println("2. View Instructions");
		System.out.println("3. Exit Game");
		int n = sc.nextInt();
		switch(n){
		case 1 : playGame();
				break ;
		case 2 : InstructGame();
				break ;
		case 3 : ExitGame();
				break ;
		default : System.out.println("play type valid input");
				break ;
		
		}

	}

	private static void ExitGame() {
		System.out.println("ExitGame method is invoked");
		
	}

	private static void InstructGame() {
		System.out.println("InstructGame method is invoked");
		
	}

	private static void playGame() {
		System.out.println("PlayGame method is invoked");
		
	}

}
