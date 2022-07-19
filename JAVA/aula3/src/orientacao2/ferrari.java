package orientacao2;

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
}


