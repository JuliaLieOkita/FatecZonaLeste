import java.util.Random;

public class Aeronave {

	String empresa;
	int numAeronave;
	int numAssentos;
	
	Piloto piloto;
	
	Random random = new Random();
	int i;
	
	public Aeronave(String empresa, int numAeronave, int numAssentos, Piloto piloto) {
		this.empresa = empresa;
		this.numAeronave = numAeronave;
		this.numAssentos = numAssentos;
		this.piloto = piloto;
	}
	
	public void decolarPousar() {
		
		i = random.nextInt(2);
		
		if (i < 1) {
			System.out.println("O piloto " + piloto.getNome() + " está pousando a aeronave " + numAeronave + 
					" da companhia " + empresa + "\n");
		} else {
			System.out.println("O piloto " + piloto.getNome() + " está decolando com a aeronave " + numAeronave + 
					" da companhia " + empresa + "\n");
		}
		
	}
	
}