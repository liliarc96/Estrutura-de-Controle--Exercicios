package com.tabuada;

public class Tabuada {
	public int tabuadaDe;

	public int getTabuadaDe() {
		return tabuadaDe;
	}

	public void setTabuadaDe(int tabuadaDe) {
		this.tabuadaDe = tabuadaDe;
	}
	
	public void tabuadaDeMultiplicacao() {
		int zeroADez;
		System.out.println("\nTabuada de " + this.tabuadaDe + ":\n");
		
		for(zeroADez = 0;zeroADez <= 10; zeroADez++) {
			System.out.println(tabuadaDe + " X " + zeroADez + " = " + (this.tabuadaDe * zeroADez) + "\n");
		}
	}
}
