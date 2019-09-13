package com.gasolina;

import java.util.Scanner;

public class PostoGasolina {
	
	public static double calculoDespesa(double maxCombustivel, double tanque) {
		double refri = 3;
		double litros = ((maxCombustivel - tanque) * 2.50);
		
		double despesaFinal = (litros + (2 * refri));
		
		System.out.println("\n\n" + (maxCombustivel - tanque) + " L de gasolina - " + "R$ " + litros + "\n");
		System.out.println( "2 uni. Refrigerante(s) - " + "R$ " + (2 * refri) + "\n");
		System.out.println("VALOR FINAL = R$ " + despesaFinal);
		
		return despesaFinal;
	}

	public static void main(String[] args) {
		Motorista motorista1 = new Motorista();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a capacidade do seu tanque de combustível: ");
		motorista1.capacidadeTanque = leitor.nextInt();
		
		System.out.println("Digite a quantidade de combustível no seu tanque: ");
		motorista1.qntGasolina = leitor.nextInt();
		
		motorista1.despesaFinal = calculoDespesa(motorista1.capacidadeTanque, motorista1.qntGasolina);		
	}

}
