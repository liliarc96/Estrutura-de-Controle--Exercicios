package com.aumentosalarial;
import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {

		Trabalhador trabalhador1 = new Trabalhador();
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor do seu salário inicial: ");
		trabalhador1.salario = leitor.nextInt();
		
		System.out.println("Informe a porcentagem de aumento:");
		trabalhador1.salarioAumento = leitor.nextInt();
		
		trabalhador1.calculaNovoSalario();
	}

}
