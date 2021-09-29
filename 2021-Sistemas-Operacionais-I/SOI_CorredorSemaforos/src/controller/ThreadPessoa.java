package controller;

import java.util.concurrent.Semaphore;

public class ThreadPessoa extends Thread {

	private int idPessoa;
	private Semaphore semaforo;

	public ThreadPessoa(int idPessoa, Semaphore semaforo) {
		this.idPessoa = idPessoa;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		pessoaAndando();
		try {
			semaforo.acquire();
			pessoaPassando();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}

	private void pessoaAndando() {
		int corredor = 200;
		int andar = (int) ((Math.random() * 3) + 4);
		int tempo = 1000;
		int distPercorrida = 0;

		while (distPercorrida < corredor) {
			distPercorrida += andar;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (distPercorrida <= corredor) {
				System.out.println("A pessoa #" + idPessoa + " andou " + distPercorrida + "m no corredor");
			} else {
				System.out.println("A pessoa #" + idPessoa + " percorreu 200m no corredor");
			}
		}
	}

	private void pessoaPassando() {
		int tempo = (int) ((Math.random() * 2000) + 1000);
		System.out.println("A pessoa #" + idPessoa + " está abrindo a porta");
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("A pessoa #" + idPessoa + " abriu e cruzou a porta!");
	}

}