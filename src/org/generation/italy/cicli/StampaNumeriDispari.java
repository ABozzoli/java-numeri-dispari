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
		System.out.println("\nEcco " + howMany + " numeri casuali da 0 a 99:");
		int[] numbers = new int[howMany];
		
		// assegna ad ogni elemento dell'array un numero casuale e stampali tutti
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rGen.nextInt(100);
			System.out.println(numbers[i]);
		}
		
		// stampa solo se dispari e contali + conta pari + somma numeri tra 10 e 50
		int nOdd = 0;
		int nEven = 0;
		int sum = 0;
		
		System.out.println("\nDi cui i seguenti sono dispari: ");
		
		for(int i = 0; i < numbers.length; i++) {
			
			if (!(numbers[i] % 2 == 0)) {
				System.out.println(numbers[i]);
				nOdd++;
			} else {
				nEven++;
			}
			
			if ((numbers[i] > 10) && (numbers[i] < 50)) {
				sum += numbers[i];
			}
			
		}
		
		System.out.println("\nQuindi i numeri dispari sono: " + nOdd);
		System.out.println("\nEd i numeri pari sono: " + nEven);
		System.out.println("\nLa somma dei numeri compresi tra 10 e 50 �: " + sum);
		
		// Scanner close
		scanner.close();
		
	}

}
