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
			System.out.println("O n�mero " + "� par.\n");
		}else {
			System.out.println("O n�mero " + "� �mpar.\n");
		}
	}
}
