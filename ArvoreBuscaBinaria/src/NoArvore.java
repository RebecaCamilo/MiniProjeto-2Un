
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

	public NoArvore busca(NoArvore no, Valor valorprocurado) {
		if(no.valor == null)
			return null;
		
		if(no.valor.rgm > valorprocurado.rgm)
			return busca(no.esquerda, valorprocurado);
		else if(no.valor.rgm < valorprocurado.rgm)
			return busca(no.direita, valorprocurado);
		else
			return no;
	}
	
	public NoArvore insere(NoArvore no, Valor novovalor) {
		if(no == null) {
//			no = new NoArvore();
			no.valor = novovalor;
			no.esquerda = no.direita = null;
		} else if(novovalor.rgm < no.valor.rgm) {
			no.esquerda = insere(no.esquerda, novovalor);
		} else if(novovalor.rgm > no.valor.rgm) {
			no.direita = insere(no.direita, novovalor);
		}	
		return no;
	}
	
	/*
	public NoArvore insere(NoArvore no, Valor novovalor) {
		if(no == null) {
			no = new NoArvore(novovalor);
//			no.valor = novovalor;
			no.esquerda = no.direita = null;
		} else if(novovalor.rgm < no.valor.rgm) {
			no.esquerda = insere(no.esquerda, novovalor);
		} else if(novovalor.rgm > no.valor.rgm) {
			no.direita = insere(no.direita, novovalor);
		}	
		return no;
	}
*/
	public void imprime(NoArvore raiz) {
		if (raiz != null) {
			imprime(raiz.esquerda);
			System.out.println(raiz.valor);
			imprime(raiz.direita);
		}
	}
	
	public NoArvore remove(NoArvore raiz, Valor valoraremover) {
		// faz a busca pelo valor a ser removido
		if (raiz.valor == null)
			return null;
		else if (raiz.valor.rgm > valoraremover.rgm)
			raiz.esquerda = remove(raiz.esquerda, valoraremover);
		else if (raiz.valor.rgm < valoraremover.rgm)
			raiz.direita = remove(raiz.direita, valoraremover);
		else {	// passar por aqui significa que achou o nó com o
				// valora remover procurado e agora vai removê-lo
				// segundo as 4 situações a seguir:
			// Não ter filhos (esquerda e direita == null)
			if (raiz.esquerda == null && raiz.direita == null) {
				raiz = null;
			}
			// Ter filho apenas à direita (esquerda == null)
			else if (raiz. esquerda == null) {
				raiz = raiz.direita;
			}
			// Ter filho apenas à esquerda (direita == null)
			else if (raiz.direita == null) {
				raiz = raiz.esquerda;
			}
			// Ter dois filhos (esquerda e direita != null)
			else {
				NoArvore sub_esquerda = raiz.esquerda;
				// encontrar o nó com maior valor na subárvore esquerda
				while (sub_esquerda.direita != null) {
					sub_esquerda = sub_esquerda.direita;
				}
				// aqui a sub_esquerda.valor tem o maior valor
				raiz.valor = sub_esquerda.valor;
				sub_esquerda.valor = valoraremover;
				raiz.esquerda = remove(raiz.esquerda, valoraremover);
			}
		}
		return raiz;		
	}
}



