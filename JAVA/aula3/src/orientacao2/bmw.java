package orientacao2;

public class bmw extends carro {
	
	public bmw() {
		super();
	}
	@Override
	public double calcularAcelerecao(double velocidadeFinal, double tempoFinal) {
		System.out.println("bmw sobreescreve");
		return velocidadeFinal / tempoFinal;
}
	
}