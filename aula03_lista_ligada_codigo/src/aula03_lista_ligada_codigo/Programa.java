package aula03_lista_ligada_codigo;

public class Programa {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		lista.adicionar("AC");
		lista.adicionar("SP");
		lista.adicionar("CE");
		lista.adicionar("DF");
		lista.adicionar("SP");
		System.out.println();
		System.out.println("Tamanho: "+lista.getTamanho());
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("Ultimo: "+lista.getUltimo().getValor());
		System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(1).getValor());
		System.out.println(lista.get(2).getValor());
		System.out.println(lista.get(3).getValor());
		
		

	}

}
