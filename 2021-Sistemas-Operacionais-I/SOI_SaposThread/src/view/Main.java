package view;

import controller.ThreadSapo;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Foi dada a largada!\n");
		
		int posicao = 1;
		
		for (int idThread = 0; idThread < 5; idThread++) {
			Thread tSapo = new ThreadSapo(posicao);
			tSapo.start();
			posicao +=1;
		}
		
	}

}