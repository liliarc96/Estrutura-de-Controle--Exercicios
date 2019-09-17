package com.pousada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pousada {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		int index = 0;
		double lucro = 0.0;
		
		Scanner leitor = new Scanner(System.in);
		List<String> listaNomes = new ArrayList<>();
		
		while(true) {
			System.out.println("Digite o nome do cliente: ");
			listaNomes.add(leitor.nextLine());
			
			if(listaNomes.contains("fim")) {
				listaNomes.remove("fim");
				System.out.println("\n\nLUCRO FINAL: R$ " + lucro + "\n");
				break;
			}else {
				System.out.println("Digite a quantidade de dias que ficou hospedado: ");
				cliente.tempoEstada = leitor.nextInt();
				leitor.nextLine();
				lucro += (cliente.calculaDiaria(listaNomes.get(index), cliente.tempoEstada));
				index++;
			}
		}
	}
}
