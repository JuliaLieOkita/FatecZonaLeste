import java.util.Random;

public class Aeroporto {
	
	String nome;
	String localizacao;
	String sigla;
	
	Random random = new Random();
	int i;
	
	public Aeroporto(String nome, String localizacao, String sigla) {
		this.nome = nome;
		this.localizacao = localizacao;
		this.sigla = sigla;
	}
	
	public void estacionamento() {
		
		i = random.nextInt(2);
		
		if (i < 1) {
			System.out.println("Estacionamento cheio, proibida a chegada de mais aeronaves...\n");
		} else {
			System.out.println("Estacionamento liberado!\n");
		}
		
	}

}