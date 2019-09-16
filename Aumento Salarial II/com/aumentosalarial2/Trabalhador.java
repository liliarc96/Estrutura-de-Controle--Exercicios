package com.aumentosalarial2;

public class Trabalhador {
	public double salario;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void calculaNovoSalario() {
		double aumento = ((this.salario * 20.0)/100.0);
		double novoSalario = (this.salario + aumento);
		System.out.println("O valor do novo salário igual à R$ " + novoSalario + ".");
	}
}
