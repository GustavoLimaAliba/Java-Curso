package javabasico;

public class vetor {

	public static void main(String[] args) {
		int[] notas = new int[10];
		notas[2] = 5;
		notas[6] = 9;
		notas[4] = 2;
		notas[1] = 4;
		notas[9] = 7;
		notas[7] = 8;
		notas[9] = 10;

		String[] carros = new String[] {"Bmw", "Ferrari","mercedes"};
		System.out.println(carros.length);
		
		for(String carro : carros) {
			System.out.println(carro);
		}
		
		//System.out.println(notas[2]);
		//System.out.println(notas[6]);
		//System.out.println(notas[4]);
		/*System.out.println(notas[1]);
		System.out.println(notas[9]);
		System.out.println(notas[7]); */

		/*for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}*/
}}
