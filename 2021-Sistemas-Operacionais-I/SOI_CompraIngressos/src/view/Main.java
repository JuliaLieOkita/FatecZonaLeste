package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCompra;

public class Main {

	public static void main(String[] args) {

		int ingresso;

		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);

		for (int idComprador = 1; idComprador <= 300; idComprador++) {
			ingresso = (int) ((Math.random() * 4) + 1);
			Thread tCompra = new ThreadCompra(idComprador, ingresso, semaforo);
			tCompra.start();
		}

	}

}
