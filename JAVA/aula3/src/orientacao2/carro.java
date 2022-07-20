package orientacao2;

public abstract class carro {
	
	private String marca;
	private String modelo;
	private int aceleracao;
	private int velocidade;
	private double kmPorLtro;
	public int setVelocidade;
	
	public abstract void piscarAlerta();
	
public carro() {
		System.out.println("construindo o carro");
	}
public carro(String marca, String modelo) {
	this.marca = marca;
	this.modelo = modelo;
	
}
	 public void acelerar() {
		System.out.println("acelrando.......");
	}
	 public void freiar() {
		System.out.println("freiando.....");
	}
	 public double calcularAcelerecao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
		return ((velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial));
	}
	 public double calcularAcelerecao(double velocidadeFinal, double tempoFinal) {
			return ((velocidadeFinal - 0) / (tempoFinal - 0));
		}
	 public String calcularAcelerecao(int velocidadeFinal, int tempoFinal) {
			return ""+((velocidadeFinal - 0) / (tempoFinal - 0));
		}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAceleracao() {
		return aceleracao;
	}
	public void setAceleracao(int aceleracao) {
		this.aceleracao = aceleracao;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) throws negocioException {
		if( velocidade <= 0) {
			throw new negocioException("valor invalido");
		} else {
		this.velocidade = velocidade;
		}
	}
	public double getKmPorLtro() {
		return kmPorLtro;
	}
	public void setKmPorLtro(double kmPorLtro) {
		this.kmPorLtro = kmPorLtro;
	}
	 
	/*DEfault - Não tem uma palavrachave
	 * public, livre acesso
	 * private, so permite acesso na propria classe
	 * portected, ele é permitido ser acessador por subclasses
	 *  */
}
