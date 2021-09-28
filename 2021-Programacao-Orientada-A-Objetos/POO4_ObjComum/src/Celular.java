import java.util.Random;

public class Celular {
	
	String marca;
	String modelo;
	String cor;
	int armazenamento;
	int memoria;
	
	Random random = new Random();
	int i;
	
	public Celular(String marca, String modelo, String cor, int armazenamento, int memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.armazenamento = armazenamento;
		this.memoria = memoria;
	}
	
	public void reiniciarCel() {
		System.out.println("\nReiniciando...");
	}
	
	public void instalarApp() {
		i = random.nextInt(2);
		
		if (i < 1) {
			System.out.println("Instalando aplicativo... Memória insuficiente!");
		} else {
			System.out.println("Aplicativo instalado com sucesso!");
		}
	}
	
	public void tirarFoto() {
		i = random.nextInt(2);
		
		if (i < 1) {
			System.out.println("Processando foto... Memória insuficiente!");
		} else {
			System.out.println("Foto salva com sucesso!");
		}
	}
	
	public void dados() {
		System.out.println("\n\nCelular: \nMarca: " + marca + " | Modelo: " + modelo + " | Cor: " + cor + 
				 " | Armazenamento: " + armazenamento + "GB" + " | Memória: " + memoria + "GB de RAM");
	}

}