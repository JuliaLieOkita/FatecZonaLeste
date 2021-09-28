import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Dinossauro skeep = new Dinossauro();
		Scanner scan = new Scanner(System.in);

		char letra = ' ';
		
		while(true) {

			skeep.status();
			
			System.out.println("===Selecione uma opção===\n*(P)ular\n*(C)orrer\n*Co(M)er\n*C(A)ntar\n"
					+ "*Tomar (S)ol\n*Ficar na S(O)mbra");
			
			String textoMaiusculo = scan.nextLine().toUpperCase();
			letra = textoMaiusculo.charAt(0);
			
			switch (letra) {
			case 'P':
				skeep.pular();
				break;
			case 'C':
				skeep.correr();
				break;
			case 'M':
				skeep.comer();
				break;
			case 'A':
				skeep.cantar();
				break;
			case 'S':
				skeep.tomarSol();
				break;
			case 'O':
				skeep.ficarNaSombra();
				break;
			default:
				break;
			}
			
		}
		
	}

}
