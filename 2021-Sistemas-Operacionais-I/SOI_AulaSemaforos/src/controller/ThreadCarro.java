package controller;

import java.util.concurrent.Semaphore;

public class ThreadCarro extends Thread {

	private int idCarro;
	private static int posChegada;
	private static int posSaida;
	private Semaphore semaforo;

	public ThreadCarro(int idCarro, Semaphore semaforo) {
		this.idCarro = idCarro;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		carroAndando();
		// ----------Início Seção Crítica----------
		try {
			// tentar execucar as linhas
			semaforo.acquire();
			carroEstacionado();
		} catch (InterruptedException e) {
			// tratamento de exceção
			e.printStackTrace();
		} finally {
			// linhas que ocorrem ao término do try OU do catch
			semaforo.release();
			// ----------Fim Seção Crítica----------
			carroSaindo();
		}
	}

	private void carroAndando() {
		// Math.random() => 0 |- 0,9999999999
		// De 0 a 1000 => (Min) 0 * 10001 = 0 || (Max) 0,99999999 * 1001 =
		// 1000,999999 -> (int) 1000
		// De 1000 a 2000 = distTotal.
		int distTotal = (int) ((Math.random() * 1001) + 1000);
		int distPercorrida = 0;
		int deslocamento = 100;
		int tempo = 1000;

		while (distPercorrida < distTotal) {
			distPercorrida += deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("#" + idCarro + " já percorreu" + distPercorrida + " m.");
		}
		posChegada++;
		System.out.println("#" + idCarro + " foi o " + posChegada + "° a chegar");
	}

	private void carroEstacionado() {
		System.out.println("#" + idCarro + " estacionou!");
		int tempo = (int) ((Math.random() * 2001) + 1000);
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void carroSaindo() {
		posSaida++;
		System.out.println("#" + idCarro + " foi o " + posSaida + "° a sair.");
	}

}