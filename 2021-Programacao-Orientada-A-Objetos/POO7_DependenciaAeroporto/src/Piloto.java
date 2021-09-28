public class Piloto extends Pessoa{
	
	int breve;

	public Piloto(String nome, int idade, long cpf, int breve) {
		super(nome, idade, cpf);
		this.breve = breve;
	}
	
	public String getNome() {
		return nome;
	}

	public void pilotar() {
		System.out.println("O piloto " + nome + ", brevê: " + breve + ", está pilotando!\n");
	}
	
}