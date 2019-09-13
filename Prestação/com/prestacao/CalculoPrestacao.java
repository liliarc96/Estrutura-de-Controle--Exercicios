package com.prestacao;

import java.util.Scanner;

public class CalculoPrestacao {

	public static void main(String[] args) {
		FuncionarioPublico funcionario1 = new FuncionarioPublico();

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor do seu salário bruto: ");
		funcionario1.valorSalario = leitor.nextInt();
		
		System.out.println("Informe o valor da prestação: ");
		funcionario1.prestacao = leitor.nextInt();
		
		funcionario1.calculoDePrestacao();
	}

}
