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
		for(int i = 0; i < numbers.length; i++) {
			if (!(numbers[i] % 2 == 0)) {
				System.out.println(numbers[i]);
			}
		}
		
		// totale numeri dispari
		int nOdd =0;
		for(int i = 0; i < numbers.length; i++) {
			if (!(numbers[i] % 2 == 0)) {
				nOdd++;
			}
		}
		System.out.print("\nQuindi i numeri dispari sono: " + nOdd);

		// totale numeri pari
		int nEven =0;
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				nEven++;
			}
		}
		System.out.print("\nEd i numeri pari sono: " + nEven);
		
		// Scanner close
		scanner.close();
		
	}

}
