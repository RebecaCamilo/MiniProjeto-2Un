
public class NoArvore {
	Valor		valor;
	NoArvore	direita;
	NoArvore	esquerda;
	
	public NoArvore(){
		this.valor = null;
		this.direita = null;
		this.esquerda = null;
	}
	public NoArvore(Valor novovalor) {
		this.valor = novovalor;
		this.direita = null;
		this.esquerda = null;
	}
    
	public NoArvore busca(NoArvore no, int valorprocurado) {
		if(no == null)
			return null;
		
		if(no.valor.rgm > valorprocurado)
			return busca(no.esquerda, valorprocurado);
		else if(no.valor.rgm < valorprocurado)
			return busca(no.direita, valorprocurado);
		else
			return no;
	}
	
	public NoArvore insere(NoArvore no, Valor novovalor) {
		if(no == null) {
			no = new NoArvore();
			no.valor = novovalor;
			no.esquerda = no.direita = null;
		} else if (no.valor.rgm > novovalor.rgm) {
			no.esquerda = insere(no.esquerda, novovalor);
		} else if(no.valor.rgm < novovalor.rgm) {
			no.direita = insere(no.direita, novovalor);
		}
		return no;
	}
	
	public void imprimeIn(NoArvore raiz) {        
		if (raiz != null) {
			imprimeIn(raiz.esquerda);
			System.out.println(raiz.valor.rgm + " - " + raiz.valor.nome);
			imprimeIn(raiz.direita);
		}
	}
	
	public void imprimePre(NoArvore raiz) {	        
		if (raiz != null) {
			System.out.println(raiz.valor.rgm + " - " + raiz.valor.nome);
			imprimePre(raiz.esquerda);
			imprimePre(raiz.direita);
	        }
	}
	
	public void imprimePos(NoArvore raiz) {	    
		if (raiz != null) {
			imprimePos(raiz.esquerda);
			imprimePos(raiz.direita);
			System.out.println(raiz.valor.rgm + " - " + raiz.valor.nome);
	    }
	}
	
	public NoArvore remove(NoArvore raiz, int valoraremover) {
		// faz a busca pelo valor a ser removido
		if (raiz == null) {
//			System.out.println("RGM não encontrado.\n");
			return null;
		} else if (raiz.valor.rgm > valoraremover)
			raiz.esquerda = remove(raiz.esquerda, valoraremover);
		else if (raiz.valor.rgm < valoraremover)
			raiz.direita = remove(raiz.direita, valoraremover);
		else {	// passar por aqui significa que achou o nó com o
				// valor a remover procurado e agora vai removê-lo
				// segundo as 4 situações a seguir:
			// Não ter filhos (esquerda e direita == null)
			if (raiz.esquerda == null && raiz.direita == null) {
				raiz = null;
			}
			// Ter filho apenas à esquerda (esquerda == null)
			else if (raiz. direita == null) {
				raiz = raiz.esquerda;
			}
			// Ter filho apenas à direita (direita == null)
			else if (raiz.esquerda == null) {
				raiz = raiz.direita;
			}
			// Ter dois filhos (esquerda e direita != null)
			else {
				NoArvore sub_direita = raiz.direita;
				// encontrar o nó com menor valor na subárvore direita
				while (sub_direita.esquerda != null) {
					sub_direita = sub_direita.esquerda;
				}
				// aqui a sub_direita.valor tem o menor valor
				raiz.valor = sub_direita.valor;
				sub_direita.valor.rgm = valoraremover;
				raiz.direita = remove(raiz.direita, valoraremover);
			}
		}
		return raiz;		
	}
	
	public void esvaziaArvore(NoArvore raiz) {	    
		if (raiz != null) {
			esvaziaArvore(raiz.esquerda);
			esvaziaArvore(raiz.direita);
			raiz.esquerda = raiz.esquerda = null;
		}
	}
}



