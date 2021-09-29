package view;

import java.util.Random;

import controller.ThreadVetor;

public class Main {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int vet[] = new int [1000];
		
		for (int i = 0; i < 1000; i++) {
			vet[i] = r.nextInt(100)+1;
		}
		
		for (int num = 1; num <= 2; num++) {
			Thread tVetor = new ThreadVetor(vet, num);
			tVetor.start();
		}
		
	}

}