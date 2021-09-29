package controller;

import java.util.concurrent.Semaphore;

public class ThreadCarro extends Thread {

	private int idCarro;
	private String[] sentido = { "Norte", "Sul", "Leste", "Oeste" };
	private static int sentido0 = 0;
	private Semaphore semaforo;

	public ThreadCarro(int idCarro, Semaphore semaforo) {
		this.idCarro = idCarro;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		try {
			semaforo.acquire();
			carro();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}

	private void carro() {
		int tempo = (int) ((Math.random() * 5000) + 1000);
		System.out.println("O carro #" + idCarro + " está cruzando em direção ao " + sentido[sentido0]);
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("O carro #" + idCarro + " terminou seu cruzamento em direção ao " + sentido[sentido0]);
		sentido0++;
	}

}