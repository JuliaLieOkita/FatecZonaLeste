package controller;

public class ThreadSoma extends Thread{
	
	private int m[][];
	
	public ThreadSoma(int m[][]) {
		this.m = m;
	}
	
	@Override
	public void run() {
		threadSoma1(m);
		threadSoma2(m);
		threadSoma3(m);
	}
	
	private void threadSoma1 (int m[][]) {
		
		int soma1 = 0;
		
		for (int l = 0; l < 1; l++) {
			for (int c = 0; c < 5; c++) {
				soma1 += m[l][c];
			}
		}
		System.out.println("\nLinha 1\nSoma = " + soma1);
	}
	
	private void threadSoma2 (int m[][]) {
		
		int soma2 = 0;
		
		for (int l = 1; l < 2; l++) {
			for (int c = 0; c < 5; c++) {
				soma2 += m[l][c];
			}
		}
		System.out.println("\nLinha 2\nSoma = " + soma2);
	}
	
	private void threadSoma3 (int m[][]) {
		
		int soma3 = 0;
		
		for (int l = 2; l < 3; l++) {
			for (int c = 0; c < 5; c++) {
				soma3 += m[l][c];
			}
		}
		System.out.println("\nLinha 3\nSoma = " + soma3);
	}

}