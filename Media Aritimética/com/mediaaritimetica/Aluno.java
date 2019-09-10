package com.mediaaritimetica;

public class Aluno {
	private float nota1;
	private float nota2;
	
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	public float mediaAritimetica(float nota1, float nota2) {
		float media = (nota1 + nota2)/2;
		return media;
	}
}