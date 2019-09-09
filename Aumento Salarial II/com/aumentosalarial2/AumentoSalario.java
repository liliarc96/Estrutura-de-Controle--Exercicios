package com.aumentosalarial2;
import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {

		Trabalhador trabalhador1 = new Trabalhador();
		
		float salarioAtual;
		String nomeTrabalhador = null;
		int onOff = 1;
		
		Scanner leitor = new Scanner(System.in);
		
		while(onOff == 1) {
			System.out.println("Digite um nome para continuar, 'fim' para sair: ");
			nomeTrabalhador = leitor.nextLine();
				
			if(nomeTrabalhador != "fim"){
				System.out.println(nomeTrabalhador + ", informe o valor do seu salário inicial: ");
				salarioAtual = leitor.nextInt();
				
				if(salarioAtual <= 500) {
					trabalhador1.calculaNovoSalario(salarioAtual, nomeTrabalhador);
				}
				else {
					System.out.println(nomeTrabalhador + " não tem direito ao aumento de 20%.");
				}
			}else {
				onOff = 0;
				System.out.println("Saindo...");
			}
		}
		
		
		/*for(;onOff == 1;) {
			System.out.println("Digite um nome para continuar, 'fim' para sair: ");
			nomeTrabalhador = leitor.nextLine();
			
			if(nomeTrabalhador != "fim"){
				System.out.println(nomeTrabalhador + ", informe o valor do seu salário inicial: ");
				salarioAtual = leitor.nextInt();
					
				if(salarioAtual <= 500) {
					trabalhador1.calculaNovoSalario(salarioAtual, nomeTrabalhador);			
				}else {
					System.out.println(nomeTrabalhador + " não tem direito ao aumento de 20%.");
				}
			}else {
				onOff = 0;
				System.out.println("Saindo...");
			}
		}*/
	}
	
}
