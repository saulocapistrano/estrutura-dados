package aula05_lista_ligada_codigo;

public class Elemento<TIPO> {
	private TIPO valor;
	private Elemento<TIPO> proximo;
	
	public Elemento(TIPO novoValor) {
		this.valor = novoValor;
	}
	
	public TIPO getValor() {
		return valor;
	}
	
	public void setValor(TIPO valor) {
		this.valor = valor;
	}
	
	public Elemento<TIPO> getProximo() {
		return proximo;
	}
	
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

}