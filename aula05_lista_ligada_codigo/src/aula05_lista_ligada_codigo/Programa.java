package aula05_lista_ligada_codigo;

public class Programa {

	public static void main(String[] args) {
		
		ListaLigada<String> lista = new ListaLigada<String>();
		lista.adicionar("AC");
		lista.adicionar("SP");
		lista.adicionar("CE");
		lista.adicionar("DF");
		lista.adicionar("SP");
		System.out.println();
		System.out.println("A lista de Estados tem tamanho: "+lista.getTamanho());
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("Ultimo: "+lista.getUltimo().getValor());
		System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(1).getValor());
		System.out.println(lista.get(2).getValor());
		System.out.println(lista.get(3).getValor());
		
		
		for (int i= 0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		// Remover estado CE
		
		lista.remover("CE");
		lista.remover("AC");
		lista.remover("DF");
		lista.remover("SP");
		lista.remover("SP");
		System.out.println("Removeu estado CE");
		System.out.println("Tamanho:" +lista.getTamanho());
		for (int i= 0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
	}

}
