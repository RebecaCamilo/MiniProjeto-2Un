import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Valor v1 = new Valor(123, "Rebeca");
		Valor v2 = new Valor(124, "Maria");
		Valor v3 = new Valor(165, "Bruno");
		Valor v4 = new Valor(100, "Heinrich");
		
		NoArvore abb = new NoArvore();
		
		abb.insere(abb, v1);
		abb.insere(abb, v2);
		abb.insere(abb, v3);
		abb.insere(abb, v4);
		
		System.out.println(v1.rgm + v1.nome);
//		System.out.println(abb.valor.rgm);
//		
//		System.out.println(v1.rgm + v1.nome);
//		System.out.println(abb.esquerda.valor.rgm + abb.esquerda.valor.nome);
//		
//		System.out.println(abb.direita.valor.rgm + abb.direita.valor.nome);
//		
//		System.out.println(abb.direita.direita.valor.rgm + abb.direita.direita.valor.nome);
		
//		NoArvore abb = new NoArvore();
/*		int op = 1;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Seja Bem vindo ao Editor de Árvore.\n\n--------- MENU -----------"
					+ " \n[1] INSERIR\n[2] REMOVER UM NÓ\n[3] PESQUISAR\n[4] ESVAZIAR A ÁRVORE \n"
					+ "[5] EXIBIR A ÁRVORE\n[0] SAIR\n--------------------------");
			System.out.println("Digite a opção desejada: ");
			op = entrada.nextInt();
			switch(op) {
				case 1:
					System.out.print("\n----- INSERINDO ALUNO -----\nDigite RGM: ");
					int rgm = entrada.nextInt();
//					abb.insere(abb, valor.);
					System.out.print("Digite nome: ");
					String nome = entrada.next();
				case 2:
					
			}
		} while(op != 0);
		
		
		
		
		
		entrada.close();
		*/
		
		
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
