
//public class Valor extends NoArvore {
public class Valor {
	int rgm;
	String nome;
	
	
	public Valor(int rgm, String nome) {
//		super();
		this.rgm = rgm;
		this.nome = nome;
	}
	
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
