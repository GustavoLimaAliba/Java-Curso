package orientacao2;

public class principal {
public static void main(String[] args) {
	carro bmw = new carro();
	bmw.marca = "bmw";
	bmw.modelo = "M3";
	bmw.kmPorLtro = 6.7;
	bmw.aceleracao = 50;
	bmw.velocidade = 200;
	System.out.println(bmw.marca);
	System.out.println(bmw.modelo);
	System.out.println(bmw.kmPorLtro);
	System.out.println(bmw.aceleracao);
	System.out.println(bmw.velocidade);
	bmw.acelerar();
	bmw.freiar();
}
}
