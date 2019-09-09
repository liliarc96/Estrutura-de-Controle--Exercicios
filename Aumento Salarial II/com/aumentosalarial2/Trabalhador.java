package com.aumentosalarial2;

public class Trabalhador {
	private float salario;
	private String nome;
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void calculaNovoSalario(float salario, String nome) {
		float aumento = (float) ((salario * 20.0)/100.0);
		float novoSalario = (salario + aumento);
		System.out.println(nome + " tem o valor do novo salário igual à R$ " + novoSalario + ".");
	}
}
