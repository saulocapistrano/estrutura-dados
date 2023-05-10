package aula02_vetor_string_codigo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] estados = new String[10];
		estados[0] = "AC";
		estados[1] = "BA";
		estados[2] = "CE";
		estados[3] = "DF";
		estados[4] = "AM";
		estados[5] = "AP";
		estados[6] = "PB";
		estados[7] = "RN";
		estados[8] = "MS";
		estados[9] = "SP";
		
		for (int i= 0; i < estados.length; i++) {
			System.out.println("Estado "+i+ " : "+estados[i]);
		}
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o Estado que deseja buscar:");
		String siglaBusca = leitor.nextLine();
		
		// Busca linear do primeiro índice do vetor ao ultimo
		boolean encontrou = false;
		for (int i= 0; i < estados.length; i++) {
			String elemento = estados[i];
			if(elemento.equalsIgnoreCase(siglaBusca)) {
				encontrou = true;
				break;
			}
		}
		if(encontrou) {
			System.out.println("Encontrouuuuuu!");
		}else {
			System.out.println("Não encontrou!");
		}
		
		
		
	}

}
