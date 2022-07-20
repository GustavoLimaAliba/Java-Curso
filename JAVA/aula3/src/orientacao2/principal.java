package orientacao2;

public class principal {
public static void main(String[] args) {
	/*carro bmw = new carro();
	
	

	*/
	bmw bmw = new bmw();
	bmw bmwDois =new bmw();
	ferrari ferrari = new ferrari();
	bmwDois.piscarAlerta();
	ferrari.piscarAlerta();

	
	try {
	
	bmwDois.setVelocidade(-10);
	} catch (negocioException e) {
		System.out.println(e);
		
	} finally {
		System.out.println("passou aqui");
	}
	carro ferrariDois = new ferrari();
	
	ferrari.isDirigeSozinho();
	((ferrari) ferrariDois).isDirigeSozinho();
	((ferrari) ferrariDois).setDirigeSozinho(true);

	
	System.out.println(((ferrari) ferrariDois).isDirigeSozinho());
	
	carro[] carros = new carro[] {bmw,  ferrari, ferrariDois, bmwDois};
	bmwDois.calcularAcelerecao(10, 10);
	ferrariDois.calcularAcelerecao(10, 10);
	
	for (carro carro : carros) {
		if (carro instanceof ferrari) {
			System.out.println(((ferrari) carro).isDirigeSozinho());
		}
	}
	
	/*System.out.println(bmw.calcularAcelerecao(20, 10));
	bmw.setMarca("bmw");
	
	bmw.setModelo("A2");

	bmw.setKmPorLtro(2);
	//bmw.aceleracao = 50;
	bmw.setVelocidade(200);
	
	carro mercedes = new carro("mercedes", "199");
	System.out.println(mercedes.getMarca());
	System.out.println(bmw.getMarca());
	System.out.println(bmw.getModelo());
	System.out.println(bmw.getKmPorLtro());
	System.out.println(bmw.getAceleracao());
	System.out.println(bmw.getVelocidade());
	bmw.acelerar();
	bmw.freiar();
	
	System.out.println(bmw.calcularAcelerecao(bmw.getVelocidade(), 10, 10, 6));
	System.out.println(bmw.calcularAcelerecao(bmw.getVelocidade(), 10));
	System.out.println(bmw.calcularAcelerecao(100, 5));
	

*/}
}
