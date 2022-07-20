package entidade;

import orientacao2.carro;

public class ferrari extends carro {
	private boolean dirigeSozinho;
	
	public ferrari() {
		super();
		
	}
	
	public double calcularAcelerecao(double velocidadeFinal, double tempoFinal) {
		System.out.println("FErrarri sobrescreve");
		return velocidadeFinal / tempoFinal;
}

	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}
	public void piscarAlerta() {
		System.out.println("ferrari piscando");
	}
	
}


