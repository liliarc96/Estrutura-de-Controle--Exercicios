package com.mediaaritimetica;

import java.util.Scanner;

public class ResultadoProva {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		int aprovados = 0;
		int reprovados = 0;
		int exame = 0;
		double somaTotal = 0;
		
		double media;
		int contador;
		
		Scanner leitor = new Scanner(System.in);
		
		for(contador = 1;contador <= 6;contador++) {
			System.out.println("\nAluno "+contador+"�:\n");
			System.out.println("Digite sua primeira nota: ");
			aluno1.nota1 = leitor.nextFloat();
			
			System.out.println("Digite sua segunda nota: ");
			aluno1.nota2 = leitor.nextFloat();
			
			media = aluno1.mediaAritimetica();
			
			if(media > 7.0) {
				System.out.println("M�dia = "+ media +"\nAprovado");
				aprovados++;
			}else if(media < 3.0) {
				System.out.println("M�dia = "+ media +"\nReprovado");
				reprovados++;
			}else {
				System.out.println("M�dia = "+ media +"\nExame");
				exame++;
			}
			
			somaTotal += media;
		}
		
		somaTotal = somaTotal/6;
		
		System.out.println("\nO n�mero de alunos aprovados �: " + aprovados);
		System.out.println("O n�mero de alunos reprovados �: " + reprovados);
		System.out.println("O n�mero de alunos de exame �: " + exame);
		System.out.println("A m�dia da classe � igual �: " + somaTotal);
	}

}
