// Escreva um programa que determine se um número digitado pelo usuário é ímpar ou par.

package lista1;

import java.util.Scanner;

public class questao10 {
	  public static void main (String[]args){

		  int numero;
		  
	      Scanner sc = new Scanner(System.in);

		  
		  System.out.println("Digite um número inteiro:");
		  numero = sc.nextInt();
		  
		  System.out.println("Você digitou: "+numero);
		  if(numero%2==0){
			  System.out.println("Esse número é par.");
		  }
		  else if(numero==0){
			  System.out.println("Esse número é zero.");
		  }
		  else{
			  System.out.println("Esse número é ímpar.");
		  }
		  
	  }
}
