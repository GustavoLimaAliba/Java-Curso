package lambdaPack;

import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;
public class lambda {
	
	static int gerarIdade(int min, int max) {
		return new SplittableRandom().nextInt(min, max); // gerando numeros aleatorios
	}
	
	public static void main(String[] args) {
	List<String>	 nomes = Arrays.asList("Gustavo","Thiago","Daniel");
	System.out.println("lista de nomes:");
	nomes.forEach((n) -> System.out.println(n));
		
	nomes.stream().map((n) -> new pessoa(n, gerarIdade(15,30))).collect(Collectors.toList()) ;
	
	System.out.println("lista de pessoas:");
	List<pessoa> pessoas = nomes.stream().map((n) -> new pessoa (n, gerarIdade(15, 20))).collect(Collectors.toList());
	pessoas.forEach((p) -> System.out.println( p.getNome() + " " + p.getIdade()));
	
	System.out.println("lista de pessoas maior de idade:");
	List<pessoa> pessoasMaiorIdade = pessoas.stream().filter((p) -> p.getIdade() >= 18).collect(Collectors.toList());
	pessoasMaiorIdade.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
	
	System.out.println("Lista de pessoas ordenadas:");
	List<pessoa> pessoasOrdenadas = pessoas.stream().sorted((pn1, pn2) -> pn1.getIdade() - pn2.getIdade()).collect(Collectors.toList());
	pessoasOrdenadas.forEach(p -> System.out.println(p.getNome() + " " + p.getIdade()));
	
	
	System.out.println("Soma das idades:");
	Integer totalidade = pessoasOrdenadas.stream().map(p -> p.getIdade()).reduce(0, (somaIdade, idade) -> somaIdade += idade);
	System.out.println("Total " + totalidade);
	//preparar os resultados para passar, como se fosse uma cópia		
	//expressao lambda retorna algo, é representada por ->
	}

}
