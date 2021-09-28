import javax.swing.JOptionPane;

public class Dinossauro {
	
	int energia = 100;
	int velocidade = 80;
	int temperatura = 30;
	String humor = "Triste";
	
	public void pular() {
		energia--;
		velocidade--;
		humor = "Feliz";
		
		JOptionPane.showMessageDialog(null, "Skeep está pulando!");
	}
	
	public void correr() {
		energia--;
		velocidade--;
		humor = "Feliz";
		
		JOptionPane.showMessageDialog(null, "Skeep está correndo!");
	}
	
	public void comer() {
		if (energia < 100) {
			energia++;
		}
		
		velocidade--;
		
		humor = "Feliz";
		
		JOptionPane.showMessageDialog(null, "Skeep está comendo!");
	}
	
	public void cantar() {
		energia--;
		humor = "Feliz";
		
		JOptionPane.showMessageDialog(null, "Skeep está cantando!");
	}
	
	public void tomarSol() {
		if (velocidade < 80) {
			velocidade++;
		}
		if (temperatura < 30) {
			temperatura++;
		}
		
		humor = "Feliz";
		
		JOptionPane.showMessageDialog(null, "Skeep está tomando Sol!");
		
	}
	
	public void ficarNaSombra() {
		energia = 100;
		temperatura--;
		this.humor = "Triste";
		
		JOptionPane.showMessageDialog(null, "Skeep está relaxando na sombra!");
	}
	
	public void status() {
		JOptionPane.showMessageDialog(null, "----- STATUS -----\nVelocidade - " + velocidade + "\nTemperatura - " + temperatura + "\nHumor - " + humor);
	}

}