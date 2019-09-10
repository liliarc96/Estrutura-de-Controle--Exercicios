package com.pousada;

import java.util.Scanner;

public class Pousada {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		String nome;
		float diaria;
		int estada;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente: ");
		nome = leitor.nextLine();
		System.out.println("Digite quantos dias ficou hospedado na pousada: ");
		estada = leitor.nextInt();
		
		diaria = cliente.calculaDiaria(nome, estada);
		
		//Só lê um cliente
	}

}
