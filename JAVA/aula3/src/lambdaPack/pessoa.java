package lambdaPack;

import java.util.stream.Stream;

public class pessoa {
	private String nome;
	private Integer idade;
	
	public pessoa(String nome, Integer idade) {
		this.idade = idade;
		this.nome = nome;
		//recebendo nome e idade
	}
	public pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
}
