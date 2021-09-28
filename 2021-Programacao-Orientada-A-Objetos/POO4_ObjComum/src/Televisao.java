public class Televisao {
	
	String marca;
	String modelo;
	String cor;
	String resolucao;
	int polegada;
	
	public Televisao(String marca, String modelo, String cor, String resolucao, int polegada) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.resolucao = resolucao;
		this.polegada = polegada;
	}
	
	public void ligar() {
		System.out.println("\nLigando...");
	}
	
	public void mudarCanal() {
		System.out.println("Mudando canal...");
	}
	
	public void desligar() {
		System.out.println("Televis�o desligada!");
	}
	
	public void dados() {
		System.out.println("\n\nTelevis�o: \nMarca: " + marca + " | Modelo: " + modelo + " | Cor: " + cor + 
				 " | Resolu��o: " + resolucao + " | Polegadas: " + polegada + "\"");
	}

}