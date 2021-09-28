import java.util.Random;

public class Bola {
	
	String cor;
	String tipo;
	String material;
	float peso;
	float circunferencia;
	
	Random random = new Random();
	
	public Bola(String cor, String tipo, String material, float peso, float circunferencia) {
		this.cor = cor;
		this.tipo = tipo;
		this.material = material;
		this.peso = peso;
		this.circunferencia = circunferencia;
	}
	
	public void rolar() {
		System.out.println("\nRolando...");
	}
	
	public void quicar() {
		System.out.println("Quicando...");
	}
	
	public void estaMurcha() {
		int i = random.nextInt(2);
		
		if (i < 1) {
			System.out.println("A bola está murcha...");
		} else {
			System.out.println("A bola está cheia!");
		}
	}
	
	public void dados() {
		System.out.println("\n\nBola: \nCor: " + cor + " | Tipo: " + tipo + " | Material: " + material + 
				 " | Peso: " + peso + "g" + " | Circunferência: " + circunferencia + "cm");
	}

}