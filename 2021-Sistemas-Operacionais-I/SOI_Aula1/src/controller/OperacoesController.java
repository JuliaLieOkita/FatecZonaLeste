package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	public void concatenaString() {
		String palavra = " ";
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			palavra = palavra + "x";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//tempoTotal em s. ns -> s (tempoTotal / 10^9)
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("String => "+tempoTotal+" s.");
	}
	
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 1000; i++){
			buffer.append("x");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Buffer => "+tempoTotal+" s.");
	}

}