package com.aumentosalarial2;
import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {

		Trabalhador trabalhador1 = new Trabalhador();
		
		boolean onOff = true;
		
		Scanner leitor = new Scanner(System.in);
		
		
		while(onOff) {
			System.out.println("Digite um nome para continuar, 'fim' para sair: ");
			trabalhador1.nome =leitor.nextLine();
				
			if(trabalhador1.nome != "fim"){
				System.out.println(trabalhador1.nome + ", informe o valor do seu salário inicial: ");
				trabalhador1.setSalario(leitor.nextInt());
				
				if(trabalhador1.salario <= 500) {
					trabalhador1.calculaNovoSalario();
				}
				else {
					System.out.println(trabalhador1.nome + " não tem direito ao aumento de 20%.");
				}
			}else {
				onOff = false;
				System.out.println("Saindo...");
			}
		}
	}
	
}
