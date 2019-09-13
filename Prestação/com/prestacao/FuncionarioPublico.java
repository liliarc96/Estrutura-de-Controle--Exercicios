package com.prestacao;

public class FuncionarioPublico {
	public double valorSalario;
	public double prestacao;
	
	public double getValorSalario() {
		return valorSalario;
	}
	public void setValorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}
	public double getPrestacao() {
		return prestacao;
	}
	public void setPrestacao(double prestacao) {
		this.prestacao = prestacao;
	}
	
	public void calculoDePrestacao() {
		double prestacaoMaximo = ((valorSalario * 30.0)/100.0);
		
		if(this.prestacao <= prestacaoMaximo) {
			System.out.println("Valor da presta��o concedido!");
		}else {
			System.out.println("Valor da presta��o ultrapassou 30% do sal�rio bruto.");
		}
	}
}
