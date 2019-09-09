package com.aumentosalarial;

public class Trabalhador {
	private float salario;
	private float salarioAumento;
	
	public float getSalario() {
		return salario;
	}
	public float getSalarioAumento() {
		return salarioAumento;
	}
	public void setSalarioAumento(float salarioAumento) {
		this.salarioAumento = salarioAumento;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void calculaNovoSalario(float salario, float salarioAumento) {
		float aumento = (float) ((salario * salarioAumento)/100.0);
		float novoSalario = (salario + aumento);
		System.out.println("Teve um aumento de " + aumento + ".\n");
		System.out.println("Valor do novo salário é igual à: R$ " + novoSalario + ".");
	}
}
