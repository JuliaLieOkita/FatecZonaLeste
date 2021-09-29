package view;

import java.util.Random;

import controller.ThreadSoma;

public class Main {
	
	public static void main(String[] args) {

		Random r = new Random();
		int m[][] = new int [3][5];
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 5; c++) {
				m[l][c] = r.nextInt(50)+1;
				System.out.print(m[l][c] + "\t");
			}
			System.out.println("\n");
		}
		
		Thread tSoma = new ThreadSoma(m);
		tSoma.start();
		
	}
	
}