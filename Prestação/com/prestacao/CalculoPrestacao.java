package com.prestacao;

import java.util.Scanner;

public class CalculoPrestacao {

	public static void main(String[] args) {
		FuncionarioPublico funcionario1 = new FuncionarioPublico();
		
		float salarioBruto;
		float valorPrestacao;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor do seu sal�rio bruto: ");
		salarioBruto = leitor.nextInt();
		
		System.out.println("Informe o valor da presta��o: ");
		valorPrestacao = leitor.nextInt();
		
		funcionario1.calculoDePrestacao(salarioBruto, valorPrestacao);
	}

}
