package estruturaDeControle;

public class switchCase2 {

	public static void main(String[] args) {
		
		String [] carros = new String [] {"bmw", "ferrari"};
		
		for(int i = 0; i < carros.length; i++) {
			if (carros[i] == "bmw") {
				System.out.println(carros[i]);
				continue;
			}
			System.out.println(carros[i]);
			System.out.println("quero esse carro");
		}
	}

}
