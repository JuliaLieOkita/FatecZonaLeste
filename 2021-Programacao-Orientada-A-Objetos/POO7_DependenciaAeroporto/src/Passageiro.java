import java.util.Random;

public class Passageiro extends Pessoa{
	
	String numPassaporte;
	
	Random random = new Random();
	int i;
	int j;

	public Passageiro(String nome, int idade, long cpf, String numPassaporte) {
		super(nome, idade, cpf);
		this.numPassaporte = numPassaporte;
	}
	
	public void comprarPassagem() {
		
		i = random.nextInt(2);
		j = random.nextInt(100);
		
		if (i < 1) {
			System.out.println("Assento " + j + " indisponível...\n");
		} else {
			System.out.println("Compra do assento " + j + " realizada com sucesso!\n");
		}

	}
	
}