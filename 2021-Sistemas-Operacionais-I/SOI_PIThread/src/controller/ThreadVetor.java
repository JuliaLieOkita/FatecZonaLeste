package controller;

public class ThreadVetor extends Thread {
	
	private int vet[];
	private int num;
	
	public ThreadVetor(int vet[], int num) {
		this.vet = vet;
		this.num = num;
	}
	
	@Override
	public void run() {
		calculaTempo(vet, num);
	}
	
	private void calculaTempo(int vet[], int num) {
		double tIni = 0.0;
		double tFim = 0.0;
		double tTotal = 0.0;
		
		switch (num) {
		case 1:
			tIni = System.nanoTime();
			
			for (int i : vet);
			
			tFim = System.nanoTime();
			tTotal = tFim - tIni;
			tTotal = tTotal / Math.pow(10, 9);
			
			System.out.println("Tempo levado para percorrer o vetor com foreach: " + tTotal + " s");
			
			
			break;
		case 2:
			tIni = System.nanoTime();
			
			for (int i = 0 ; i < vet.length; i++) { }
			
			tFim = System.nanoTime();
			tTotal = tFim - tIni;
			tTotal = tTotal / Math.pow(10, 9);
			
			System.out.println("Tempo levado para percorrer o vetor com for: " + tTotal + " s");
			
			break;
		}
		
	}

}