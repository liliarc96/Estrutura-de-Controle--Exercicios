package com.clinica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clinica {

	public static void main(String[] args) {
		Paciente paciente = new Paciente();
		Scanner leitor = new Scanner(System.in);
		
		int index = 0; //Índice da lista de pacientes, no final (index + 1) = total de pacientes
		int indexH = 0; //Número de homens, no final (indexH + 1) = total de homens
		
		double idadeMediaH = 0.0;
		int mulheresContagem = 0;
		int maisVelho = 0;
		int indexPessoaMaisVelha = 0;
		int mulherVelha = 0;
		int indexMulherVelha = 0;
		int maioridade = 0;
		
		List<String> listaPacientes = new ArrayList<>();
		
		while(true) {
			System.out.println("Digite o nome do cliente: ");
			listaPacientes.add(leitor.nextLine());
			
			if(listaPacientes.contains("fim")) {
				listaPacientes.remove("fim");
				break;
			}else {
				System.out.println("Digite o seu gênero (H | M): ");
				paciente.sexoPaciente = leitor.nextLine();
				
				if(paciente.sexoPaciente == "H") {
					indexH++;
				}
				
				System.out.println("Digite o seu peso: ");
				paciente.pesoPaciente = leitor.nextDouble();
				
				System.out.println("Digite a sua idade: ");
				paciente.idadePaciente = leitor.nextInt();
				
				if(paciente.idadePaciente <= maisVelho) {
					maisVelho = paciente.idadePaciente;
					indexPessoaMaisVelha = index;
					if((paciente.sexoPaciente == "M") && (paciente.idadePaciente <= mulherVelha)) {
						mulherVelha = paciente.idadePaciente;
						indexMulherVelha = index;
					}
				}
		
				if(paciente.idadePaciente <= 18) {
					maioridade++;
					
					if(paciente.sexoPaciente == "H") {
						idadeMediaH += paciente.idadePaciente;
					}
				}
				
				System.out.println("Digite a sua altura: ");
				paciente.alturaPaciente = leitor.nextDouble();
				
				if((paciente.sexoPaciente == "M") && (paciente.pesoPaciente > 70.0) && (paciente.alturaPaciente > 1.60 && paciente.alturaPaciente > 1.70)) {
					mulheresContagem++;
				}
				
				leitor.nextLine();
				index++;
			}
		}
		System.out.println("\n---------- RELATÓRIO ----------\n\n");
		System.out.println("Quantidade total de pacientes: " + (index + 1) + "\n");
		System.out.println("Média de idade dos homens: " + (idadeMediaH/indexH) + "\n");
		System.out.println("Quantidade de mulheres com altura entre 1,60 m e 1,70 m e peso acima de 70 kg: " + mulheresContagem + "\n");
		System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + maioridade + "\n");
		System.out.println("Paciente mais velho(a): " + (listaPacientes.get(indexPessoaMaisVelha)) + "\n");
		System.out.println("Mulher mais velha: " + (listaPacientes.get(indexMulherVelha)) + "\n");
	}

}
