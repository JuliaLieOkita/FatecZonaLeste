import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double soma;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro numero: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo numero: "));
		
		soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "Soma dos dois numeros e: " + soma);

	}

}