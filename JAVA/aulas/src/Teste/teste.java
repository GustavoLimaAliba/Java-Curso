package Teste;


	import java.util.Scanner;
	public class teste{
	    public static int Menu(){
	        Scanner in = new Scanner(System.in);
	        System.out.println("Digite o o número referente ao tamanho da pulseira\n1.Pequena (17cm) - R$180,00\n2.Média (18cm) - R$200,00\n3.Grande (20cm) - R$240,00\n4.Sair");
	        int digita = in.nextInt();
	        return digita;
	    }
	    public static double valorPulseira(int digita){
	        double valor = 0;
	        switch(digita){
	            case 1:
	            valor += 180;
	            System.out.println("Total: R$180,00\nAgora escolha o(s) pingente(s):");
	            break;
	            case 2:
	            valor += 200;
	            System.out.println("Total: R$200,00\nAgora escolha o(s) pingente(s):");
	            break;
	            case 3:
	            valor += 240;
	            System.out.println("Total: R$240,00\nAgora escolha o(s) pingente(s):");
	            break;
	        }
	        return valor;
	    }
	    public static int tamanhoPulseira(int digita){
	        int tamanhopulseira = 0;
	        switch(digita){
	            case 1:
	            tamanhopulseira = 17;
	            break;
	            case 2:
	            tamanhopulseira = 18;
	            break;
	            case 3:
	            tamanhopulseira = 20;
	            break;
	        }
	        return tamanhopulseira;
	    }
	    public static int menuAcessorio(){
	        System.out.println("1.Bichinhos (1,3cm) - R$225,00\n2.Bonequinhos (1,5cm) - R$185,00\n3.Berloques (0,5cm) - R$200,00\n4.Cubinhos (1cm) - R$190,00\n5.Rolinho (2cm) - Prata, Pedra e Esmaltados\n6.Ir para o pagamento");
	        Scanner in = new Scanner(System.in);
	        int digita2 = in.nextInt();
	        return digita2;
	    }
	    public static double suporte(double valor){
	    Scanner in = new Scanner(System.in);
	    System.out.println("\nDeseja adquirir um suporte de segurança pelo preço de R$95,00?\n1.Sim\n2.Não");
	    int digita = in.nextInt();
	    if(digita == 1){
	        valor += 95;
	    }
	    return valor;
	   }
	   public static int menuPagamento(){
	       System.out.println("\nA loja oferece os seguintes tipos de pagamento:");
	       System.out.println("\n1. À vista com 5% de desconto");
	       System.out.println("\n2. 3 vezes no cartão sem acrescimos");
	       System.out.println("\n3. 5 vezes no cartão com acresimo de 10% no preço total");
	       System.out.println("\n4. 10 vezes no cartão com acresimo de 20% no preço total");
	       System.out.println("\nDigite o número da forma de pagamento escolhida.");
	       Scanner in = new Scanner(System.in);
	       int digita3 = in.nextInt();
	       return digita3;
	    }
	   public static double pagamento(double valor, int digita3){
	    Scanner in = new Scanner(System.in);
	    double pagar = 0;
	    double valor2 = 0;
	    switch(digita3){
	        case 1:
	        valor = valor*0.95;
	        break;
	        case 2:
	        pagar = valor/3;
	        break;
	        case 3:
	        valor2 = (valor*110)/100;
	        pagar = valor2/5;
	        break;
	        case 4:
	        valor2 = (valor*120)/100;
	        pagar = valor2/10;
	        break;
	    }
	    //Condição para mostrar o valor total de acordo com o pagamento escolhido
	    if (digita3 == 3){
	        System.out.println("\nO valor total da compra ficou de: R$" +valor2);
	    } else if (digita3 == 4){
	        System.out.println("\nO valor total da compra ficou de: R$" +valor2);
	    } else {
	        System.out.println("\nO valor total da compra ficou de: R$" +valor);
	    }
	    //Condição para mostrar o valor total e o valor das parcelas se a pessoa escolheu parcelado
	    if(digita3 == 2){
	    System.out.println("\nForma de pagameto: 3 parcelas de R$" +pagar);
	    System.out.println("\nA loja aceita os seguintes cartões:\n1.Visa\n2.MasterCard\n3.Rede Shop\n4.American Express\n5.Hipercard\n6.Diners Club International");
	    int digita = in.nextInt();
	    }  else if(digita3 == 3){
	    System.out.println("\nForma de pagameto: 5 parcelas de R$" +pagar);
	    System.out.println("\nA loja aceita os seguintes cartões:\n1.Visa\n2.MasterCard\n3.Rede Shop\n4.American Express\n5.Hipercard\n6.Diners Club International");
	    int digita = in.nextInt();
	    }else if(digita3 == 4){
	    System.out.println("\nForma de pagameto: 10 parcelas de R$" +pagar);
	    System.out.println("\nA loja aceita os seguintes cartões:\n1.Visa\n2.MasterCard\n3.Rede Shop\n4.American Express\n5.Hipercard\n6.Diners Club International");
	    int digita = in.nextInt();
	    }
	    System.out.println("\nObrigado por comprar conosco!");
	    return valor;
	}
	public static void main(String args[]){
	    Scanner in = new Scanner(System.in);
	    int digita=Menu();
	    double valor = valorPulseira(digita);
	    int tamanhopulseira = tamanhoPulseira(digita);
	    double tamanhototal = 0;
	    int digita2;
	    do {
	            digita2=menuAcessorio();
	            switch(digita2){
	            case 1:
	            valor += 225;
	            tamanhototal += 1.3;
	            break;
	            case 2:
	            valor += 185;
	            tamanhototal += 1.5;
	            break;
	            case 3:
	            valor += 200;
	            tamanhototal += 0.5;
	            break;
	            case 4:
	            valor += 190;
	            tamanhototal += 1;
	            break;
	            case 5:
	            tamanhototal += 2;
	            System.out.println("Escolha o material:\n1.Prata - R$150,00\n2.Pedras - R$220,00\n3.Esmaltados - R$198,00");
	            int rolinho = in.nextInt();
	            switch(rolinho){
	                case 1:
	                valor += 150;
	                break;
	                case 2:
	                valor += 220;
	                break;
	                case 3:
	                valor += 198;
	                break;
	            }
	            }
	            if(tamanhototal > tamanhopulseira){
	                System.out.println("\nTamanho máximo da pulseira atingido\n1.Prosseguir para o pagamento.");
	                int digita3 = in.nextInt();
	            }
	            if(digita==6){
	                System.out.println("\nDigite 1 para prosseguir para o pagamento.");
	                int digita4 = in.nextInt();
	            }
	        } while (digita2 != 6 && tamanhototal < tamanhopulseira);
	    valor += suporte(valor);
	    System.out.println("\nO preço total da compra fica de: R$" +valor);
	    int digita3 = menuPagamento();
	    double pagamento = pagamento(valor, digita3);
	}
	}

