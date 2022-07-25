package orientacaoobjetosexecutor;

import orientacaoobjetos.bmw;
import orientacaoobjetos.carro;
import orientacaoobjetos.mercedes;

public class executor {
public static void main(String[] args) {
	carro carro1 = new carro();
	carro1.setMarca("bmw");
	carro1.setModelo("1201");
	carro1.setChassi(9901);
	carro1.setPlaca("1201XXX");
	carro1.setBancos(5);
	carro1.setVelocidade(200);
	
	System.out.println(carro1.getMarca());
	System.out.println(carro1.getModelo());
	System.out.println(carro1.getChassi());
	System.out.println(carro1.getPlaca());
	System.out.println(carro1.getBancos());
	
	System.out.println(carro1.acelerar());
	
	carro carro2 = new carro("mercedes");
	System.out.println(carro2.getMarca());
	
	System.out.println(soma(10,5));
	System.out.println(soma(10,5,3));

	bmw bmw = new bmw();
	bmw.setVelocidade(100);
	System.out.println(bmw.acelerar());
	
	mercedes mercedes = new mercedes();
	mercedes.setVelocidade(0);
	System.out.println(mercedes.acelerar());

}

public static int soma(int a, int b) {
	return a+b;
}
public static int soma(int a, int b, int c) {
	return a+b+c;
}
}
