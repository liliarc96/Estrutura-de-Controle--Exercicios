package com.tabuada;
import java.util.Scanner;

public class MostrarTabuada {

	public static void main(String[] args) {
		Tabuada tabuada = new Tabuada();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual a tabuada que deseja mostrar?");
		tabuada.tabuadaDe = leitor.nextInt();
		
		tabuada.tabuadaDeMultiplicacao();
	}
}
