package com.prestacao;

import java.util.Scanner;

public class CalculoPrestacao {

	public static void main(String[] args) {
		FuncionarioPublico funcionario1 = new FuncionarioPublico();
		
		float salarioBruto;
		float valorPrestacao;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor do seu salário bruto: ");
		salarioBruto = leitor.nextInt();
		
		System.out.println("Informe o valor da prestação: ");
		valorPrestacao = leitor.nextInt();
		
		funcionario1.calculoDePrestacao(salarioBruto, valorPrestacao);
	}

}
