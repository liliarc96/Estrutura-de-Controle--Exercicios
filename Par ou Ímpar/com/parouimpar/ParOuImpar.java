package com.parouimpar;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Numeros dezNumeros = new Numeros();
		
		int numero;
		int contaDez = 1;
		
		Scanner leitor = new Scanner(System.in);
		
		while(contaDez <= 10) {
			System.out.println("Digite o " + contaDez + "° número:");
			
			numero = leitor.nextInt();
			
			dezNumeros.parOuImpar(numero);
			
			contaDez++;
		}
	}
}
