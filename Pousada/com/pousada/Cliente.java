package com.pousada;

public class Cliente {
	public String nomeCliente;
	public float precoDiaria;
	public float taxaDiaria;
	public int tempoEstada;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public float getPrecoDiaria() {
		return precoDiaria;
	}
	public void setPrecoDiaria(float precoDiaria) {
		this.precoDiaria = precoDiaria;
	}
	public float getTaxaDiaria() {
		return taxaDiaria;
	}
	public void setTaxaDiaria(float taxaDiaria) {
		this.taxaDiaria = taxaDiaria;
	}
	public int getTempoEstada() {
		return tempoEstada;
	}
	public void setTempoEstada(int tempoEstada) {
		this.tempoEstada = tempoEstada;
	}
	
	public float calculaDiaria(String nomeCliente, int tempoEstada) {
		this.precoDiaria = (float) 40.0;
		
		if(tempoEstada >= 10) {
			this.taxaDiaria = (float) 10.0;
		}else {
			this.taxaDiaria = (float) 15.0;
		}
		
		float precoTotal = (this.precoDiaria * tempoEstada) + (this.taxaDiaria * tempoEstada);
		
		System.out.println("\nNome: " + nomeCliente);
		System.out.println("Tempo de estada: " + tempoEstada + " dia(s)");
		System.out.println("Preço total da estada: ");
		System.out.println("  -Preço diária: " + "R$ " + this.precoDiaria);
		System.out.println("  -Taxa diária: " + "R$ " + this.taxaDiaria + "\n");
		System.out.println("PREÇO TOTAL: " + "R$ " + precoTotal + "\n");
		
		return precoTotal;
	}
}
