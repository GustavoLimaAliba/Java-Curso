package Exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
	
		Scanner nome = new Scanner (System.in);
		 Scanner email = new Scanner (System.in);
		Scanner confirmarEmail = new Scanner (System.in);
	 Scanner idade = new Scanner (System.in);
		int contador = 0;
		int[] teste = new int[contador];
		
		
		
		System.out.println("Cadastrar \nDigite seu nome: ");
		String nomeS = nome.next();
		System.out.println("Ola " + nomeS + ", Digite seu email: ");
		String emailS = email.next();
		System.out.println("Confirme seu email: ");
		String emailS2 = confirmarEmail.next();
		System.out.println("Confirme sua idade: ");
		int idadeS = idade.nextInt();
		
		if(nomeS.length() <= 2 || emailS.length() <=5 || idadeS < 18) {
			System.out.println("Preencha todos os campos corretamente \n *Seu nome deve ter mais de duas letras"
					+ " \n *o Email deve ter mais de 5 digitos\n *Voce deve ter mais de 18 anos");

	
		}
		else {
			++contador;
			for(int i = 0; i <= teste.length; i++) {
				System.out.println( "\n pessoas cadastradas: " + contador);
				
				    
				        Scanner in = new Scanner(System.in);
				        System.out.println("Digite o o número referente a temperatura do seu notebook \n1.19 \n2.25 \n3 38 \n4.Sair");
				        int digita = in.nextInt();
				       double valor = 0;
				      
				       
				      
				   switch(digita) {
				   
				   case 1:
			            valor += 180;
			            System.out.println("Total: R$180,00");
			            break;
			            case 2:
			            valor += 200;
			            System.out.println("Total: R$200,00\n");
			            break;
			            case 3:
			            valor += 240;
			            System.out.println("Total: R$240,00\n");
			            break;
				   
				   }
				   
				   System.out.println("Digite o tempo que voce quer esperar: \n1 semana \n2 semanas \n3 semanas");
				   int digita2 = in.nextInt();
				   switch(digita2) {
				  
				   case 1:
					   System.out.println("o total vai ser: " + valor * 2);
				 break;
				   case 2:
					   System.out.println("o total vai ser: "+ valor * 1.50);
					   break;
				   
				   case 3: 
					   System.out.println("o total vai ser: " + valor *1.30);
				
				   }
			
				
			}
		}}}
	

