public class Main {

	public static void main(String[] args) {
		
		Aeroporto aeroportoC = new Aeroporto("Congonhas", "Av. Washington Luís, s/nº - Vila Congonhas, São Paulo - SP, 04626-911", "CGH");
		Aeroporto aeroportoG = new Aeroporto("Guarulhos", "Rod. Hélio Smidt, s/nº - Aeroporto, Guarulhos - SP, 07190-100", "GRU");
		aeroportoC.estacionamento();
		aeroportoG.estacionamento();
		
		Passageiro passageiroA = new Passageiro("Armando", 54, 55555555555L, "BR123456");
		Passageiro passageiroB = new Passageiro("Barbara", 18, 33333333333L, "BR987654");
		passageiroA.comprarPassagem();
		passageiroB.comprarPassagem();
		
		Piloto pilotoA = new Piloto("Amanda", 27, 11111111111L, 1234);
		Piloto pilotoB = new Piloto("Breno", 35, 22222222222L, 9876);
		pilotoA.pilotar();
		pilotoB.pilotar();
		
		Aeronave aeronaveA = new Aeronave("Azul Airlines", 15, 144, pilotoA);
		Aeronave aeronaveE = new Aeronave("Emirates Airline", 12, 350, pilotoB);
		aeronaveA.decolarPousar();
		aeronaveE.decolarPousar();

	}

}
