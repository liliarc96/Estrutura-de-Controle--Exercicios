
public class Tabuada {
	private int tabuadaDe;

	public int getTabuadaDe() {
		return tabuadaDe;
	}

	public void setTabuadaDe(int tabuadaDe) {
		this.tabuadaDe = tabuadaDe;
	}
	
	public void tabuadaDeMultiplicacao(int tabuadaDe) {
		int zeroADez;
		int resultado;
		System.out.println("\nTabuada de " + tabuadaDe + ":\n");
		
		for(zeroADez = 0;zeroADez <= 10; zeroADez++) {
			resultado = tabuadaDe * zeroADez;
			System.out.println(tabuadaDe + " X " + zeroADez + " = " + resultado + "\n");
		}
	}
}
