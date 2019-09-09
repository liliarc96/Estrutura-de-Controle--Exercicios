package com.prestacao;

public class FuncionarioPublico {
	private float valorSalario;
	private float prestacao;
	public float getValorSalario() {
		return valorSalario;
	}
	public void setValorSalario(float valorSalario) {
		this.valorSalario = valorSalario;
	}
	public float getPrestacao() {
		return prestacao;
	}
	public void setPrestacao(float prestacao) {
		this.prestacao = prestacao;
	}
	
	public void calculoDePrestacao(float valorSalario, float prestacao) {
		float prestacaoMaximo = (float) ((valorSalario * 30)/100.0);
		
		if(prestacao <= prestacaoMaximo) {
			System.out.println("Valor da prestação concedido!");
		}else {
			System.out.println("Valor da prestação ultrapassou 30% do salário bruto.");
		}
	}
}
