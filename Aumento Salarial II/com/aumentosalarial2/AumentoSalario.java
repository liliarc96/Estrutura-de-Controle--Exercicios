package com.aumentosalarial2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {

		boolean onOff = true;
		Trabalhador trabalhador1 = new Trabalhador();
		List<String> listaFuncionarios = new ArrayList<>();
		Scanner leitor = new Scanner(System.in);
		
		
		while(onOff) {
			System.out.println("\nDigite um nome para continuar, 'fim' para sair: ");
			listaFuncionarios.add(leitor.nextLine());
			
			System.out.println(listaFuncionarios);
			if(listaFuncionarios.contains("fim")){
				listaFuncionarios.remove("fim");
				System.out.println("Saindo...");
				onOff = false;
			}else {
				System.out.println("\nInforme o valor do seu salário inicial: ");
				trabalhador1.salario = leitor.nextDouble();
				leitor.nextLine();
				if(trabalhador1.salario <= 500) {
					trabalhador1.calculaNovoSalario();
				}else {
					System.out.println("\nVocê não tem direito ao aumento de salário!");
				}
			}
		}
	}
}
