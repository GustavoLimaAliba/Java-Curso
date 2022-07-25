package estruturaDeControle;

public class ifElse {

	public static void main(String[] args) {
int idade = 16;

if (idade >= 100) {
	System.out.println("muito maior de idade");
}
else if(idade >= 18) {
	System.out.println("maior de idade");
}
else {
	System.out.println("menor de idade " + idade);
}
	}

}
