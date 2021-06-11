import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		Valor v1 = new Valor(100, "Initial");
		Valor v2 = new Valor(124, "Maria");
		Valor v3 = new Valor(165, "Bruno");
		Valor v4 = new Valor(123, "Rebeca");

		/*
		NoArvore abb = new NoArvore(v1);
		
		abb.insere(abb, v2);
		abb.insere(abb, v3);
		abb.insere(abb, v4);
		
		abb.imprime(abb);
		 */
		
		NoArvore abb = new NoArvore(v1);
		int op = 1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Seja Bem vindo ao Editor de Árvore.\n\n");
		do {
			System.out.println("--------- MENU -----------\n[1] INSERIR\n[2] REMOVER UM NÓ\n[3] PESQUISAR\n[4] "
					+ "ESVAZIAR A ÁRVORE \n[5] EXIBIR A ÁRVORE\n[0] SAIR\n--------------------------");
			System.out.println("Digite a opção desejada: ");
			op = entrada.nextInt();
			switch(op) {
				case 1:
					System.out.print("\n----- INSERINDO ALUNO -----\nDigite RGM: ");
					int rgm = entrada.nextInt();
					System.out.print("Digite nome: ");
					String nome = entrada.next();
					Valor controle = new Valor(rgm, nome);
					abb.insere(abb, controle);
					break;
				case 2:
//	b) a opção 2, remover, deve utilizar o SUCESSOR e mostrar o conteúdo do nó removido. Caso não
//	exista, dar mensagem correspondente
					System.out.print("\n----- REMOVENDO ALUNO -----\nDigite RGM: ");
					int rgm2 = entrada.nextInt();
					abb.remove(abb, rgm2);
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					abb.imprime(abb);
					
			}
		} while(op != 0);
		
		
		
		
		
		entrada.close();
	
		
		
//		insere(NoArvore no, int novovalor)
		
//		public Valor(int rgm, String nome)
		/*
		Valor v1 = new Valor(123, "Rebeca");
		Valor v2 = new Valor(124, "Maria");
		Valor v3 = new Valor(165, "Bruno");
		Valor v4 = new Valor(100, "Heinrich");
		
		NoArvore abb = new NoArvore();	//quando inicializo a instanciação da certo
//		NoArvore abb = new NoArvore(6);
		abb.insere(abb, v1);
		System.out.println("oi");
		abb.insere(abb, v2);
		System.out.println("ola");
		abb.insere(abb, v3);
		abb.insere(abb, v4);
//		abb.insere(abb, 3);
//		abb.insere(abb, 1);
//		abb.insere(abb, 9);
//		abb.insere(abb, 7);
		*/
		
		
//		System.out.println(v1.rgm + v1.nome);
//		System.out.println(abb.valor.rgm);
//		
//		System.out.println(v2.rgm + v2.nome);
//		System.out.println(abb.valor.rgm + abb.esquerda.valor.nome);
		
		/*
		NoArvore resultado = abb.busca(abb, v1);
		
		if(resultado == null)
			System.out.println("Não encontrei o no 10");
		else
			System.out.println("Encontrei o nó: "+resultado.valor);
		
		abb.imprime(abb);
		abb.remove(abb, v4);
		abb.imprime(abb);
		
		System.out.println("ola2");*/
	}

}
