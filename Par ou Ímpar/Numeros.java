
public class Numeros {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void parOuImpar(int numero) {
		if(numero%2 == 0) {
			System.out.println("O n�mero " + "� par.\n");
		}else {
			System.out.println("O n�mero " + "� �mpar.\n");
		}
	}
}
