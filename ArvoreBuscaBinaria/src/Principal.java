import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		Valor v1 = new Valor(100, "Roberta");
		Valor v2 = new Valor(124, "Maria");
		Valor v3 = new Valor(165, "Bruno");
		Valor v4 = new Valor(123, "Rebeca");

		
		NoArvore abb = new NoArvore(v1);
		int op = 1;
		Scanner entrada = new Scanner(System.in);
		
		abb.insere(abb, v2);
		abb.insere(abb, v3);
		
		System.out.println("Seja Bem vindo ao Editor de Árvore.\n\n");
		do {
			System.out.println("--------- MENU -----------\n[1] INSERIR\n[2] REMOVER UM NÓ\n[3] PESQUISAR\n[4] "
					+ "ESVAZIAR A ÁRVORE \n[5] EXIBIR A ÁRVORE\n[0] SAIR\n--------------------------");
			System.out.print("Digite a opção desejada: ");
			op = entrada.nextInt();
			int rgm;
			switch(op) {
			
				case 1:
					System.out.print("\n----- INSERINDO ALUNO -----\nDigite RGM: ");
					rgm = entrada.nextInt();
					
					System.out.print("Digite nome: ");
					String nome = entrada.next();
					Valor controle = new Valor(rgm, nome);
					abb.insere(abb, controle);
					System.out.println("Aluno inserido com sucesso.\n");
					break;
				case 2:
					System.out.print("\n----- REMOVENDO ALUNO -----\nDigite RGM: ");
					rgm = entrada.nextInt();
					
					if(abb.busca(abb, rgm) == null)
						System.out.println("RGM NÃO encontrado.");
					else {						
						System.out.println("O aluno(a) " + abb.busca(abb, rgm).valor.nome +" cujo RGM é " + abb.busca(abb, rgm).valor.rgm + " foi removido.\n");
						abb.remove(abb, rgm);
					}
					break;
				case 3:
					System.out.print("\n----- PESQUISANDO ALUNO -----\nDigite RGM: ");
					rgm = entrada.nextInt();
					
					if(abb.busca(abb, rgm) == null)
						System.out.println("RGM NÃO encontrado.");
					else 						
						System.out.println("RGM encontrado: " + abb.busca(abb, rgm).valor.rgm + " - " + abb.busca(abb, rgm).valor.nome + "\n");					
					break;
				case 4:
					
					break;
				case 5:
					System.out.print("\n----- EXIBINDO A ÁRVORE -----\n");
					abb.imprime(abb);
					System.out.println();
					
			}
		} while(op != 0);
		
		System.out.println("\nPrograma finalizado.");		
		
		entrada.close();
	}

}
