import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class GestaoAlunos {

	public static void main(String[] args) {
		GestaoAlunos gestaoAlunos = new GestaoAlunos();
		gestaoAlunos.menu();
	}
		
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Aluno[] alunos = new Aluno[50];
		
		long id;
		Date nascimento;
		String ra;
		String nome;
		
		int indice = 0;
		
		public void criar() {
			
			System.out.println("----- Criar usuário -----");
			
			id = new Random().nextLong();
			
			System.out.println("Digite o nome do aluno: ");
			nome = scan.nextLine();
			
			try {
				System.out.println("Digite a data de nascimento (dd/mm/yyyy): ");
				nascimento = format.parse(scan.nextLine());
			} catch (ParseException e) {
				System.out.println("Data inválida");
			}
			
			System.out.println("Digite o RA do aluno: ");
			ra = scan.nextLine();
			
			alunos[indice] = new Aluno(id, nascimento, ra, nome);
			indice++;
			
		}
		
		public void atualizar() {
			
			System.out.println("----- Atualizar usuário -----");
			System.out.println("Digite o RA do aluno: ");
			ra = scan.nextLine();
			
			for (int i = 0; i < alunos.length; i++) {
				if (ra.equals(alunos[i].getRa())) {
					
					System.out.println("Digite o nome a ser alterado: ");
					nome = scan.nextLine();
					
					try {
						System.out.println("Digite a data de nascimento a ser alterada: ");
						nascimento = format.parse(scan.nextLine());
					} catch (ParseException e) {
						System.out.println("Data inválida");
					}
					
					System.out.println("Dados atualizados com sucesso!");
					alunos[i] = new Aluno(id, nascimento, ra, nome);
					return;
				}
			}
			System.out.println("RA não encontrado!");
			
		}
		
		public void excluir() {
			
			System.out.println("----- Excluir usuário -----");
			System.out.println("Digite o RA do aluno: ");
			ra = scan.nextLine();
			
			for (int i = 0; i < alunos.length; i++) {
				if (ra.equals(alunos[i].getRa())) {
					alunos[i] = null;					
					System.out.println("Aluno removido com sucesso!");
					indice--;
					return;
				}
			}
			System.out.println("RA não encontrado!");
			
		}
		
		public void exibir() {
			
			System.out.println("----- Exibir usuário -----");
			System.out.println("Digite o RA do aluno: ");
			ra = scan.nextLine();
			
			try {
				for (int i = 0; i < alunos.length; i++) {
					if (ra.equals(alunos[i].getRa())) {
						System.out.println(alunos[i].toString());
						return;
					}
				}
			} catch (Exception e) {
				System.out.println("RA não encontrado!");
			}
			
		}
		
		public void menu() {
			Scanner scan = new Scanner(System.in);

			char letra = ' ';
			
			while(true) {				
				System.out.println("===Selecione uma opção===\n*(C)riar\n*(E)xibir\n*(R)emover\n*(A)tualizar\n"
						+ "*(S)air");
				
				String textoMaiusculo = scan.nextLine().toUpperCase();
				letra = textoMaiusculo.charAt(0);
				
				switch (letra) {
				case 'C':
					criar();
					break;
				case 'E':
					exibir();
					break;
				case 'R':
					excluir();
					break;
				case 'A':
					atualizar();
					break;
				case 'S':
					System.exit(0);
					break;
				}
				
			}
			
		}

	}