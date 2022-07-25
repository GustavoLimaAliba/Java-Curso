package javabasico;

public class operadores {
	
	public static void main(String[] args) {
		int a = 11; //operador de atribuição
		int b = 5;
		
		
		b += a; //aditivo
		b -= a; //subtrativo
		b = b + a;
		b *= a;
		b /= a;
		b %= a; //modular pega o resto
		System.out.println(a %=b);
	}
}
