package org.generation.italy.cicli;

import java.util.Scanner;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		// init Scanner
		System.out.print("Quanti numeri vuoi generare? ");
		Scanner scanner = new Scanner(System.in);
		int howMany = scanner.nextInt();
		
		// genera array
		System.out.println("Ecco " + howMany + " numeri casuali:");
		int[] numbers = new int[howMany];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.println(numbers[i]);
		}
		
		// Scanner close
		scanner.close();
		
	}

}
