package com.aumentosalarial2;

public class Trabalhador {
	public double salario;
	public String nome;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void calculaNovoSalario() {
		double aumento = ((this.salario * 20.0)/100.0);
		double novoSalario = (this.salario + aumento);
		System.out.println(this.nome + " tem o valor do novo salário igual à R$ " + novoSalario + ".");
	}
}
