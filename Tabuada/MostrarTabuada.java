import java.util.Scanner;

public class MostrarTabuada {

	public static void main(String[] args) {
		Tabuada tabuada = new Tabuada();
		
		int numero;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual a tabuada que deseja mostrar?");
		numero = leitor.nextInt();
		
		tabuada.tabuadaDeMultiplicacao(numero);
	}
}
