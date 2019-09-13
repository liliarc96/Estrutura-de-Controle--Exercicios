package com.parouimpar;

public class Numeros {
	public int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void parOuImpar() {
		if(this.numero%2 == 0) {
			System.out.println("O número " + "é par.\n");
		}else {
			System.out.println("O número " + "é ímpar.\n");
		}
	}
}
