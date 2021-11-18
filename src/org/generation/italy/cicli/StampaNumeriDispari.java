package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		// Scanner init
		System.out.print("Quanti numeri vuoi generare? ");
		Scanner scanner = new Scanner(System.in);
		int howMany = scanner.nextInt();
		
		// Random init
		Random rGen = new Random();
		
		// crea array vuoto
		System.out.println("Ecco " + howMany + " numeri casuali da 0 a 99:");
		int[] numbers = new int[howMany];
		
		// assegna ad ogni elemento dell'array un numero casuale e stampali tutti
		for(int i = 0; i < numbers.length; i++) {
			int rNum = rGen.nextInt(100);
			numbers[i] = rNum;
			System.out.println(numbers[i]);
		}
		
		// stampa solo se dispari
		System.out.println("\nDi cui i seguenti sono dispari: ");
		for(int j = 0; j < numbers.length; j++) {
			if (!(numbers[j] % 2 == 0)) {
				System.out.println(numbers[j]);
			}
		}
		
		// Scanner close
		scanner.close();
		
	}

}
