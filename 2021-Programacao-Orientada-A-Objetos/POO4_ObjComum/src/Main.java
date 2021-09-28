public class Main {

	public static void main(String[] args) {
		
		Televisao tvSa = new Televisao("Samsung", "50AU7700", "Preta", "4K", 50);
		tvSa.dados();
		tvSa.ligar();
		tvSa.mudarCanal();
		tvSa.desligar();
		
		Televisao tvSo = new Televisao("LG", "43LM6300PSB", "Cinza", "Full HD", 43);
		tvSo.dados();
		tvSo.ligar();
		tvSo.mudarCanal();
		tvSo.desligar();
		
		Bola bolaV = new Bola("Branca", "Vôlei", "Couro", 280f, 67f);
		bolaV.dados();
		bolaV.rolar();
		bolaV.quicar();
		bolaV.estaMurcha();
		
		Bola bolaB = new Bola("Laranja", "Basquete", "Borracha", 623f, 74.9f);
		bolaB.dados();
		bolaB.rolar();
		bolaB.quicar();
		bolaB.estaMurcha();
		
		Celular celM = new Celular("Motorola", "Moto G10", "Cinza Aurora", 64, 4);
		celM.dados();
		celM.reiniciarCel();
		celM.instalarApp();
		celM.tirarFoto();
		
		Celular celX = new Celular("Xiaomi", "Redmi Note 9", "Polar White Glacial", 128, 4);
		celX.dados();
		celX.reiniciarCel();
		celX.instalarApp();
		celX.tirarFoto();

	}

}