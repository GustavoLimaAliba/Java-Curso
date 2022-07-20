package orientacao2;

public class bmw extends carro implements conversivel, utilitario {
	
	public bmw() {
		super();
	}
	@Override
	public double calcularAcelerecao(double velocidadeFinal, double tempoFinal) {
		System.out.println("bmw sobreescreve");
		return velocidadeFinal / tempoFinal;
}
	public void piscarAlerta() {
		System.out.println("bmw piscando");
	};
	public void acionarTurbo() {
		System.out.println("turbo bmw");
	}
	public void passear() {
		System.out.println("passeando");
	} public void abrirCapo() {
		System.out.println("abrindo capo");
	}
}