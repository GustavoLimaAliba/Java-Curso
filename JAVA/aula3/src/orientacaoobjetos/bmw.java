package orientacaoobjetos;

public class bmw extends carro {

	public bmw() {
		this.setMarca("bmw");
	}
	
@Override
public String acelerar() {
	// TODO Auto-generated method stub
	return "a bmw pode fazer de 0 " + this.getVelocidade()+ " em 5s";
}
}
