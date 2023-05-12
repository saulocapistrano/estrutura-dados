package aula04_lista_ligada_codigo;

public class Elemento {
	private String valor;
	
	public Elemento(String novoValor) {
		this.valor = novoValor;
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	private Elemento proximo;
}
