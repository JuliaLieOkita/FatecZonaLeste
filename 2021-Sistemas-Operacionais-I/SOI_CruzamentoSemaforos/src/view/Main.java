package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCarro;

public class Main {

	public static void main(String[] args) {

		int permissao = 1;
		Semaphore semaforo = new Semaphore(permissao);

		for (int idCarro = 1; idCarro < 5; idCarro++) {
			Thread tCarro = new ThreadCarro(idCarro, semaforo);
			tCarro.start();
		}

	}

}