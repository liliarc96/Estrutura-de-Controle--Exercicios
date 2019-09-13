package com.aumentosalarial;

public class Trabalhador {
	public double salario;
	public double salarioAumento;
	
	public double getSalario() {
		return salario;
	}
	public double getSalarioAumento() {
		return salarioAumento;
	}
	public void setSalarioAumento(double salarioAumento) {
		this.salarioAumento = salarioAumento;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void calculaNovoSalario() {
		double aumento = ((this.salario * this.salarioAumento)/100.0);
		double novoSalario = (this.salario + aumento);
		System.out.println("Teve um aumento de R$ " + aumento + ".\n");
		System.out.println("Valor do novo salário é igual à: R$ " + novoSalario + ".");
	}
}
