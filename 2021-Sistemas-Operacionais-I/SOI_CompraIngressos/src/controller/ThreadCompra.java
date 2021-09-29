package controller;

import java.util.concurrent.Semaphore;

public class ThreadCompra extends Thread {

	private int idComprador;
	private static int ingressoTotal = 100;
	private int ingresso;
	private Semaphore semaforo;

	public ThreadCompra(int idComprador, int ingresso, Semaphore semaforo) {
		this.idComprador = idComprador;
		this.ingresso = ingresso;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		if (login() == true && processoCompra() == true) {
			// ----------Início Seção Crítica----------
			try {
				semaforo.acquire();
				validaCompra();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforo.release();
				// ----------Fim Seção Crítica----------
			}

		}
	}

	private boolean login() {
		int tempoLogin = (int) ((Math.random() * 1951) + 50);

		try {
			sleep(tempoLogin);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (tempoLogin > 1000) {
			System.out.println("(TIMEOUT) Comprador " + idComprador + ", o tempo de login foi esgotado...");
			return false;
		} else {
			System.out.println("Comprador " + idComprador + " seu login foi realizado com sucesso!");
			return true;
		}
	}

	private boolean processoCompra() {
		int tempoCompra = (int) ((Math.random() * 2001) + 1000);

		try {
			sleep(tempoCompra);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (tempoCompra > 2500) {
			System.out.println("(TIMEOUT) Comprador " + idComprador + ", o tempo da seção foi esgotada...");
			return false;
		} else {
			System.out.println("O comprador " + idComprador + " selecionou " + ingresso + " ingressos(s)");
			return true;
		}
	}

	private void validaCompra() {
		if (ingressoTotal - ingresso >= 0) {
			System.out.println("O comprador " + idComprador + " comprou " + ingresso + " ingressos(s)");
			ingressoTotal -= ingresso;
			if (ingressoTotal != 0) {
				System.out.println("Ainda temos " + ingressoTotal + " ingressos disponíveis!");
			} else {
				System.out.println("Os ingressos foram esgotados");
			}
		} else {
			System.out.println("Comprador " + idComprador + ", infelizmente não temos mais ingressos suficientes...");
		}
	}

}