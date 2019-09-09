import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {

		Trabalhador trabalhador1 = new Trabalhador();
		
		float salarioAtual;
		float porcentagem;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor do seu salário inicial: ");
		salarioAtual = leitor.nextInt();
		
		System.out.println("Informe a porcentagem de aumento:");
		porcentagem = leitor.nextInt();
		
		trabalhador1.calculaNovoSalario(salarioAtual, porcentagem);
	}

}
