package controller;

import java.util.Random;

public class ThreadSapo extends Thread{
	
	Random r = new Random();
	
	private int salto;
	private int dist;
	private int pista;
	int posicao;
	
	public ThreadSapo(int posicao) {
		this.dist = 0;
		this.pista = 50;
		this.posicao = posicao;
	}
	
	@Override
	public void run() {
		sapo(posicao);
	}
	
	private void sapo(int posicao) {
		
		while(dist < pista) {
			salto = r.nextInt(5)+1;
			dist += salto;
			System.out.println("O sapo " + getId() + " saltou " + salto + "m e percorreu um total de " + dist + "m!");
			
			if(dist >= pista) {
				System.out.println("\nO sapo " + getId() + " terminou a corrida e ficou em " + posicao + "° lugar!\n");
			}
		}
	}
	
}