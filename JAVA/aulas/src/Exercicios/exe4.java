package Exercicios;
import java.util.Scanner;
public class exe4 {
	

	
	  public static void main(String[] args) 
	  {
	    Scanner input = new Scanner (System.in);
	   Scanner idade = new Scanner (System.in);
	   
	    System.out.print("primeiro nome: ");
	    String fname = input.next();
	    System.out.print("ultimo nome: ");
	    String lname = input.next();
	    System.out.println("sua idade:  ");
	    int idadea = idade.nextInt();
	    if(idadea <= 18) {
	    	System.out.println("voce nao tem idade para isso");
	    	return;
	    }
	    System.out.println();
	    System.out.println("Ola \n"+fname+" "+lname + "\n Sua idade é: \n" + idadea);
	  }
	}

